package msa.language.unnamed.lang.ast.node;

public class VariableDefinitionASTNode extends IdentifiableASTNode {

    private final ExpressionASTNode expressionASTNode;

    private final ConstraintASTNode constraintASTNode;

    public VariableDefinitionASTNode(String name, ExpressionASTNode expressionASTNode, ConstraintASTNode constraintASTNode) {
        super(name);
        this.expressionASTNode = expressionASTNode;
        this.constraintASTNode = constraintASTNode;
    }

    public ExpressionASTNode getExpressionASTNode() {
        return expressionASTNode;
    }

    public ConstraintASTNode getConstraintASTNode() {
        return constraintASTNode;
    }
}
