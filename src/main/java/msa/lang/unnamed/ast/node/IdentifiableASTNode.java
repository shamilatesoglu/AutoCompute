package msa.lang.unnamed.ast.node;

public abstract class IdentifiableASTNode extends UnnamedAbstractSyntaxTreeNode {
    private final String id;

    public IdentifiableASTNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
