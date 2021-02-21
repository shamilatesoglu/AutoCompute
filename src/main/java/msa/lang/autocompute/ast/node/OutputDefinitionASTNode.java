package msa.lang.autocompute.ast.node;

public class OutputDefinitionASTNode extends VariableDefinitionASTNode {
    public OutputDefinitionASTNode(String name, ExpressionASTNode expressionASTNode, GivenASTNode givenASTNode) {
        super(name, expressionASTNode, givenASTNode);
    }
}
