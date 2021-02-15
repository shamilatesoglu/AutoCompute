package msa.language.unnamed.ast.node;

public class InputDefinitionASTNode extends UnnamedAbstractSyntaxTreeNode {

    private final ReferencingASTNode reference;
    private final ExpressionASTNode value;

    public InputDefinitionASTNode(ReferencingASTNode reference, ExpressionASTNode value) {
        this.reference = reference;
        this.value = value;
    }

    public ExpressionASTNode getExpression() {
        return value;
    }

    public ReferencingASTNode getReference() {
        return reference;
    }
}
