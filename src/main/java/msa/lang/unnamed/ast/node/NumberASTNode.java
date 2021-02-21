package msa.lang.unnamed.ast.node;

public class NumberASTNode extends ExpressionASTNode {
    private final Double value;

    public NumberASTNode(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
