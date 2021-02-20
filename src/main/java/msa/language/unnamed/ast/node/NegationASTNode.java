package msa.language.unnamed.ast.node;

public class NegationASTNode extends ExpressionASTNode {
    private final ExpressionASTNode innerNode;

    public NegationASTNode(ExpressionASTNode innerNode) {
        this.innerNode = innerNode;
    }

    public ExpressionASTNode getInnerNode() {
        return innerNode;
    }

}
