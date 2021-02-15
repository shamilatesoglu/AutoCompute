package msa.language.unnamed.lang.ast.node;

public class EntityASTNode extends UnnamedAbstractSyntaxTreeNode {
    private final String id;
    private final  EntityBodyASTNode entityBodyASTNode;

    public EntityASTNode(String id, EntityBodyASTNode entityBodyASTNode) {
        this.id = id;
        this.entityBodyASTNode = entityBodyASTNode;
    }

    public EntityBodyASTNode getBlockASTNode() {
        return entityBodyASTNode;
    }

    public String getId() {
        return id;
    }
}
