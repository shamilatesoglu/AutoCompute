package msa.language.unnamed.lang.ast.node;

public class PropertyASTNode extends IdentifiableASTNode{

    private final Object value;

    public PropertyASTNode(String id, Object value) {
        super(id);
        this.value = value;
    }

    public Object getValue() {
        return value;
    }
}
