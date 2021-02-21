package msa.lang.unnamed.ast.node;

import java.util.ArrayList;
import java.util.List;

public class ComputeCallASTNode extends UnnamedAbstractSyntaxTreeNode {
    private final ReferencingASTNode reference;

    private final List<InputDefinitionASTNode> inputs;

    public ComputeCallASTNode(ReferencingASTNode reference) {
        this.reference = reference;
        this.inputs = new ArrayList<>();
    }

    public ReferencingASTNode getReference() {
        return reference;
    }

    public List<InputDefinitionASTNode> getInputs() {
        return inputs;
    }
}
