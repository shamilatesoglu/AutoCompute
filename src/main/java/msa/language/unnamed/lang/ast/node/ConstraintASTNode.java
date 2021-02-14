package msa.language.unnamed.lang.ast.node;

public class ConstraintASTNode extends ExpressionASTNode{
    private final ExpressionASTNode constraint;

    public ConstraintASTNode(ExpressionASTNode constraint) {
        this.constraint = constraint;
    }

    public ExpressionASTNode getConstraint() {
        return constraint;
    }
}
