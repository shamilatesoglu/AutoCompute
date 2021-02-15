package msa.language.unnamed.ast.node;

public class ConditionalExpressionASTNode extends ExpressionASTNode {
    private ExpressionASTNode check;
    private ExpressionASTNode first;
    private ExpressionASTNode second;

    public ConditionalExpressionASTNode(ExpressionASTNode check, ExpressionASTNode first, ExpressionASTNode second) {
        this.check = check;
        this.first = first;
        this.second = second;
    }

    public ExpressionASTNode getCheck() {
        return check;
    }

    public ExpressionASTNode getFirst() {
        return first;
    }

    public ExpressionASTNode getSecond() {
        return second;
    }
}