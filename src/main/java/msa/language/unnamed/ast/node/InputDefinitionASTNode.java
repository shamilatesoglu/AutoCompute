package msa.language.unnamed.ast.node;

public class InputDefinitionASTNode extends IdentifiableASTNode {

    private final ExpressionASTNode value;

    public InputDefinitionASTNode(String reference, ExpressionASTNode value) {
        super(reference);
        this.value = value;
    }

    public ExpressionASTNode getExpression() {
        return value;
    }
}
