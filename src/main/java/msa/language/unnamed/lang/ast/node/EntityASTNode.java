package msa.language.unnamed.lang.ast.node;

public class EntityASTNode extends UnnamedAbstractSyntaxTreeNode {
    private final String id;
    private EntityBodyASTNode entityBodyASTNode;

    public EntityASTNode(String id, EntityBodyASTNode entityBodyASTNode) {
        this.id = id;
        this.entityBodyASTNode = entityBodyASTNode;
    }

    public EntityBodyASTNode getBlockASTNode() {
        return entityBodyASTNode;
    }

    public void setBlockASTNode(EntityBodyASTNode entityBodyASTNode) {
        this.entityBodyASTNode = entityBodyASTNode;
    }

    public String getId() {
        return id;
    }
}
