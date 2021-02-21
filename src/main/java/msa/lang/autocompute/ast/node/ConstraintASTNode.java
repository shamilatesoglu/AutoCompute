package msa.lang.autocompute.ast.node;

public class ConstraintASTNode extends ExpressionASTNode {
    private final ExpressionASTNode constraint;
    private final String rationale;

    public ConstraintASTNode(ExpressionASTNode constraint, String rationale) {
        this.constraint = constraint;
        this.rationale = rationale;
    }

    public ExpressionASTNode getExpression() {
        return constraint;
    }

    public String getRationale() {
        return rationale;
    }
}
