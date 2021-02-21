package msa.lang.unnamed.runtime;

import msa.lang.unnamed.ast.node.*;
import msa.lang.unnamed.ds.Pair;
import msa.lang.unnamed.semantics.*;
import msa.lang.unnamed.runtime.exceptions.DependencyNotFoundException;

import java.util.*;

public class ExecutorASTVisitor extends ScopeAwareASTVisitor<Void> {

    private final Map<String, Double> evaluated;
    private final Map<String, Double> inferred;
    private final Set<String> unableToEvaluate;
    private final Map<String, Pair<Double, String>> filtered;

    private final DependencyGraph dependencyGraph;
    private final SymbolTable symbolTable;
    private final ScopeGraph scopeGraph;

    // TODO: Make use of entity properties.

    public ExecutorASTVisitor(DependencyGraph dependencyGraph, SymbolTable symbolTable, ScopeGraph scopeGraph) {
        this.dependencyGraph = dependencyGraph;
        this.symbolTable = symbolTable;
        this.scopeGraph = scopeGraph;
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
        evaluator.enterScope(getCurrentScope());
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
                enterScope(scopeGraph.get(getParent(reference)));
                Scope scope = getCurrentScope();
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
                    break;
                }
            } catch (DependencyNotFoundException e) {
                unableToEvaluate.add(reference);
            }
        }
    }

    public Map<String, Double> getInferred() {
        return inferred;
    }

    public Set<String> getUnableToEvaluate() {
        return unableToEvaluate;
    }

    public Map<String, Pair<Double, String>> getFiltered() {
        return filtered;
    }


    @Override
    public Void visit(CompilationUnitASTNode node) {

        setGlobalScope(new Scope(null, null));
        enterScope(getGlobalScope());

        for (ComputeCallASTNode computeCall : node.getComputeCalls()) {
            visit(computeCall);
        }

        enterScope(getGlobalScope());

        computeAll();

        return null;
    }

    private void computeAll() {
        LinkedList<String> dependantQueue = new LinkedList<>(evaluated.keySet());

        while (!dependantQueue.isEmpty()) {
            String id = dependantQueue.poll();
            Set<String> dependants = dependencyGraph.getImmediateDependants(id);

            if (dependants == null) continue;

            for (String dependant : dependants) {
                if (!evaluated.containsKey(dependant)) {
                    Symbol outputSymbol = symbolTable.lookup(dependant);
                    String reference = outputSymbol.getName();
                    VariableDefinitionASTNode output = (VariableDefinitionASTNode) outputSymbol.getDeclaringASTNode();

                    String scopeReference = getParent(reference);
                    enterScope(scopeGraph.get(scopeReference));

                    GivenASTNode given = output.getGivenASTNode();
                    ExpressionASTNode expression = output.getExpressionASTNode();

                    if (evaluateExpressionAndStore(reference, expression)) {
                        evaluateConstraints(reference, given);
                        dependantQueue.addLast(dependant);
                    }
                }
            }
        }
    }

    @Override
    public Void visit(InputDefinitionASTNode node) {
        String reference = getFullReference(node.getReference().getReferencedId());

        evaluated.put(reference, evaluateExpression(node.getExpression()));

        return null;
    }


    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String reference = getFullReference(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        GivenASTNode given = node.getGivenASTNode();

        if (evaluateExpressionAndStore(reference, expression)) {
            evaluateConstraints(reference, given);
        }

        return null;
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        String reference = getFullReference(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        GivenASTNode given = node.getGivenASTNode();

        if (evaluateExpressionAndStore(reference, expression)) {
            evaluateConstraints(reference, given);
        }

        return null;
    }
}
