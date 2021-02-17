package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.runtime.exceptions.DependencyNotFoundException;
import msa.language.unnamed.semantics.ScopeAwareASTVisitor;
import msa.language.unnamed.semantics.StaticScope;
import msa.language.unnamed.semantics.SymbolTable;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ExecutorASTVisitor extends ScopeAwareASTVisitor<Double> {

    private final Map<String, Double> evaluated;
    private final Set<String> unableToEvaluate;
    private final Map<String, Double> filtered;

    private final DependencyGraph dependencyGraph;
    private final SymbolTable symbolTable;

    public ExecutorASTVisitor(DependencyGraph dependencyGraph, SymbolTable symbolTable) {
        this.dependencyGraph = dependencyGraph;
        this.symbolTable = symbolTable;
        this.evaluated = new LinkedHashMap<>();
        this.unableToEvaluate = new LinkedHashSet<>();
        this.filtered = new LinkedHashMap<>();
    }

    private void evaluateExpressionAndStore(String reference, ExpressionASTNode expression) {
        try {
            Double result = evaluateExpression(expression);
            evaluated.put(reference, result);
        } catch (DependencyNotFoundException e) {
            unableToEvaluate.add(reference);
        }
    }

    private Double evaluateExpression(ExpressionASTNode expression) {
        ExpressionEvaluatingASTVisitor evaluator = new ExpressionEvaluatingASTVisitor(evaluated);
        evaluator.setCurrentScope(getCurrentScope());
        evaluator.setGlobalScope(getGlobalScope());
        Double result = evaluator.visit(expression);
        return result;
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
        String reference = getReferenceForId(node.getReference().getReferencedId());

        evaluated.put(reference, evaluateExpression(node.getExpression()));

        return null;
    }


    @Override
    public Double visit(VariableDefinitionASTNode node) {
        String reference = getReferenceForId(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        evaluateExpressionAndStore(reference, expression);

        return null;
    }

    @Override
    public Double visit(OutputDefinitionASTNode node) {
        String reference = getReferenceForId(node.getId());

        ExpressionASTNode expression = node.getExpressionASTNode();
        evaluateExpressionAndStore(reference, expression);

        return null;
    }

}
