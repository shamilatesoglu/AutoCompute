package msa.language.unnamed.lang.ast.node;

public class InfixExpressionASTNode extends ExpressionASTNode {
    private UnnamedAbstractSyntaxTreeNode left;
    private UnnamedAbstractSyntaxTreeNode right;

    private int operator;

    public InfixExpressionASTNode(UnnamedAbstractSyntaxTreeNode left, int operator, UnnamedAbstractSyntaxTreeNode right) {
        this.left = left;
        this.operator = operator;
        this.right = right;
    }
}
