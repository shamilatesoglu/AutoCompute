package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.semantics.ScopeAwareASTVisitor;
import msa.lang.autocompute.semantics.SymbolTable;

public class DependencyResolvingASTVisitor extends ScopeAwareASTVisitor<Void> {

    private final DependencyGraph dependencyGraph;

    private final SymbolTable symbolTable;

    private IdentifiableASTNode definingASTNode;

    public DependencyResolvingASTVisitor(DependencyGraph dependencyGraph, SymbolTable symbolTable) {
        this.dependencyGraph = dependencyGraph;
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        definingASTNode = node;

        return super.visit(node);
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        definingASTNode = node;

        return super.visit(node);
    }

    @Override
    public Void visit(ReferencingASTNode node) {
        String definingName = getFullReference(definingASTNode.getId());
        String reference = getFullReference(node.getReferencedId());

        dependencyGraph.addDependency(definingName, reference);

        return super.visit(node);
    }

    @Override
    public Void visit(ComputeCallASTNode node) {
        return null;
    }
}
