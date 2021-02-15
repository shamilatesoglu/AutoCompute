package msa.language.unnamed.ast.node;

public class ReferencingASTNode extends ExpressionASTNode {
    private final String referencedId;

    public ReferencingASTNode(String referencedId) {
        this.referencedId = referencedId;
    }

    public String getReferencedId() {
        return referencedId;
    }
}
