package msa.lang.autocompute.ast.node;

import java.util.ArrayList;
import java.util.List;

public class CompilationUnitASTNode extends UnnamedAbstractSyntaxTreeNode {
    private final List<EntityASTNode> entities;
    private final List<ComputeCallASTNode> computeCalls;

    public CompilationUnitASTNode() {
        entities = new ArrayList<>();
        computeCalls = new ArrayList<>();
    }

    public List<EntityASTNode> getEntities() {
        return entities;
    }

    public List<ComputeCallASTNode> getComputeCalls() {
        return computeCalls;
    }
}
