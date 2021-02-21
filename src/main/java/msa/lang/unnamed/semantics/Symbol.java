package msa.lang.unnamed.semantics;

import msa.lang.unnamed.ast.node.IdentifiableASTNode;

public class Symbol {
    private final String name;
    private final IdentifiableASTNode declaringASTNode;

    public Symbol(String name, IdentifiableASTNode declaringASTNode) {
        this.name = name;
        this.declaringASTNode = declaringASTNode;
    }

    public String getName() {
        return name;
    }

    public IdentifiableASTNode getDeclaringASTNode() {
        return declaringASTNode;
    }
}
