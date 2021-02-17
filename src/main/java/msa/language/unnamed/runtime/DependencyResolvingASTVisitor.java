package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeVisitor;
import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.semantics.ScopeAwareASTVisitor;
import msa.language.unnamed.semantics.StaticScope;
import msa.language.unnamed.semantics.Symbol;
import msa.language.unnamed.semantics.SymbolTable;
import msa.language.unnamed.semantics.exceptions.UndefinedSymbolException;

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
        String definingName = getReferenceForId(definingASTNode.getId());
        String reference = getReferenceForId(node.getReferencedId());

        dependencyGraph.addDependency(definingName, reference);

        return super.visit(node);
    }
}
