package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.ds.Pair;
import msa.language.unnamed.runtime.exceptions.DependencyNotFoundException;
import msa.language.unnamed.semantics.ScopeAwareASTVisitor;
import msa.language.unnamed.semantics.StaticScope;
import msa.language.unnamed.semantics.Symbol;
import msa.language.unnamed.semantics.SymbolTable;

import java.util.*;

public class ExecutorASTVisitor extends ScopeAwareASTVisitor<Double> {

    private final Map<String, Double> evaluated;
    private final Map<String, Double> inferred;
    private final Set<String> unableToEvaluate;
    private final Map<String, Pair<Double, String>> filtered;

    private final DependencyGraph dependencyGraph;
    private final SymbolTable symbolTable;

    public ExecutorASTVisitor(DependencyGraph dependencyGraph, SymbolTable symbolTable) {
        this.dependencyGraph = dependencyGraph;
        this.symbolTable = symbolTable;
        this.evaluated = new LinkedHashMap<>();
        this.unableToEvaluate = new LinkedHashSet<>();
        this.filtered = new LinkedHashMap<>();
        this.inferred = new LinkedHashMap<>();
    }

    private boolean evaluateExpressionAndStore(String reference, ExpressionASTNode expression) {
        try {
            Double result = evaluateExpression(expression);
            evaluated.put(reference, result);
            inferred.put(reference, result);
            return true;
        } catch (DependencyNotFoundException e) {
            unableToEvaluate.add(reference);
            return false;
        }
    }

    private Double evaluateExpression(ExpressionASTNode expression) {
        ExpressionEvaluatingASTVisitor evaluator = new ExpressionEvaluatingASTVisitor(evaluated);
        evaluator.setCurrentScope(getCurrentScope());
        evaluator.setGlobalScope(getGlobalScope());
        Double result = evaluator.visit(expression);
        return result;
    }

    private void evaluateConstraints(String reference, GivenASTNode given) {
        String constraintSetRef = given.getConstraintSetReference();
        List<ConstraintASTNode> constraints = given.getConstraints();
        if (constraintSetRef != null) {
            Symbol constraintSetSymbol = null;
            if (symbolTable.contains(constraintSetRef)) {
                constraintSetSymbol = symbolTable.lookup(constraintSetRef);
            } else {
                StaticScope scope = getCurrentScope();
                while (scope != null) {
                    if (scope.getReference() == null) break;
                    Symbol entitySymbol = symbolTable.lookup(scope.getReference());
                    EntityASTNode entity = (EntityASTNode) entitySymbol.getDeclaringASTNode();

                    for (ConstraintSetASTNode constraintSet : entity.getBlockASTNode().getConstraintSets()) {
                        String id = constraintSet.getId();
                        if (id.equals(constraintSetRef)) {
                            constraintSetRef = getFullReference(id, scope);
                            constraintSetSymbol = symbolTable.lookup(constraintSetRef);
                            break;
                        }
                    }

                    scope = scope.getEnclosingScope();
                }

            }

            assert constraintSetSymbol != null;
            ConstraintSetASTNode constraintSet = (ConstraintSetASTNode) constraintSetSymbol.getDeclaringASTNode();
            constraints = constraintSet.getConstraints();
        }

        for (ConstraintASTNode constraint : constraints) {
            try {
                Double result = evaluateExpression(constraint.getExpression());
                if (result <= 0.0) {
                    filtered.put(reference, new Pair<>(evaluated.get(reference), constraint.getRationale()));
                    evaluated.remove(reference);
                    inferred.remove(reference);
                }
            } catch (DependencyNotFoundException e) {
                unableToEvaluate.add(reference);
            }
        }
    }

    @Override
    public Double visit(CompilationUnitASTNode node) {

        setGlobalScope(new StaticScope(null, null));
        setCurrentScope(getGlobalScope());

        for (ComputeCallASTNode computeCall : node.getComputeCalls()) {
            visit(computeCall);
        }

        setCurrentScope(getGlobalScope());

        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        setCurrentScope(getGlobalScope());

        return null;
    }

    @Override
    public Double visit(InputDefinitionASTNode node) {
        String reference = getFullReference(node.getReference().getReferencedId());

        evaluated.put(reference, evaluateExpression(node.getExpression()));

        return null;
    }


    @Override
    public Double visit(VariableDefinitionASTNode node) {
        String reference = getFullReference(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        GivenASTNode given = node.getGivenASTNode();

        if (evaluateExpressionAndStore(reference, expression)) {
            evaluateConstraints(reference, given);
        }

        return null;
    }

    @Override
    public Double visit(OutputDefinitionASTNode node) {
        String reference = getFullReference(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        GivenASTNode given = node.getGivenASTNode();

        if (evaluateExpressionAndStore(reference, expression)) {
            evaluateConstraints(reference, given);
        }

        return null;
    }

    @Override
    public Double visit(ConstraintASTNode node) {
        return visit(node.getExpression());
    }
}
