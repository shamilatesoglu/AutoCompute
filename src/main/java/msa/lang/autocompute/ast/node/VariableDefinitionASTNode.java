package msa.lang.autocompute.ast.node;

public class VariableDefinitionASTNode extends IdentifiableASTNode {

    private final ExpressionASTNode expressionASTNode;

    private final GivenASTNode givenASTNode;

    public VariableDefinitionASTNode(String name, ExpressionASTNode expressionASTNode, GivenASTNode givenASTNode) {
        super(name);
        this.expressionASTNode = expressionASTNode;
        this.givenASTNode = givenASTNode;
    }

    public ExpressionASTNode getExpressionASTNode() {
        return expressionASTNode;
    }

    public GivenASTNode getGivenASTNode() {
        return givenASTNode;
    }
}
