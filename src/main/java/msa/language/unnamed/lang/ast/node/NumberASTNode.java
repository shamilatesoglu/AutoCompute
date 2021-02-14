package msa.language.unnamed.lang.ast.node;

public class NumberASTNode extends ExpressionASTNode{
    private final Double value;

    public NumberASTNode(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
