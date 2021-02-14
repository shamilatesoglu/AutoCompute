package msa.language.unnamed.lang.ast.node;

import java.util.ArrayList;
import java.util.List;

public class EntityBodyASTNode extends UnnamedAbstractSyntaxTreeNode {

    List<InputDeclarationASTNode> inputs;

    List<VariableDefinitionASTNode> locals;

    List<OutputDefinitionASTNode> outputs;

    public EntityBodyASTNode() {
        inputs = new ArrayList<>();
        locals = new ArrayList<>();
        outputs = new ArrayList<>();
    }

    public List<InputDeclarationASTNode> getInputs() {
        return inputs;
    }

    public List<VariableDefinitionASTNode> getLocals() {
        return locals;
    }

    public List<OutputDefinitionASTNode> getOutputs() {
        return outputs;
    }
}
