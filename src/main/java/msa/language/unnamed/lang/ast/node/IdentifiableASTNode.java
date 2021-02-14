package msa.language.unnamed.lang.ast.node;

public class IdentifiableASTNode extends  UnnamedAbstractSyntaxTreeNode{
    private final String id;

    public IdentifiableASTNode(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}