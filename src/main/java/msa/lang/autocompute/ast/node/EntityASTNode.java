package msa.lang.autocompute.ast.node;

public class EntityASTNode extends IdentifiableASTNode {
    private final EntityBodyASTNode entityBodyASTNode;

    public EntityASTNode(String id, EntityBodyASTNode entityBodyASTNode) {
        super(id);
        this.entityBodyASTNode = entityBodyASTNode;
    }

    public EntityBodyASTNode getBlockASTNode() {
        return entityBodyASTNode;
    }

}
