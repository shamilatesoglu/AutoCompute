package msa.language.unnamed.ast.node;

import java.util.ArrayList;
import java.util.List;

public class EntityBodyASTNode extends UnnamedAbstractSyntaxTreeNode {

    private final List<PropertyASTNode> properties;

    private final List<ConstraintSetASTNode> constraintSets;

    private final List<InputDeclarationASTNode> inputs;

    private final List<VariableDefinitionASTNode> locals;

    private final List<EntityASTNode> entities;

    private final List<OutputDefinitionASTNode> outputs;

    public EntityBodyASTNode() {
        properties = new ArrayList<>();
        constraintSets = new ArrayList<>();
        inputs = new ArrayList<>();
        locals = new ArrayList<>();;
        entities = new ArrayList<>();
        outputs = new ArrayList<>();
    }

    public List<ConstraintSetASTNode> getConstraintSets() {
        return constraintSets;
    }

    public List<PropertyASTNode> getProperties() {
        return properties;
    }

    public List<InputDeclarationASTNode> getInputs() {
        return inputs;
    }

    public List<VariableDefinitionASTNode> getLocals() {
        return locals;
    }

    public List<EntityASTNode> getEntities() {
        return entities;
    }

    public List<OutputDefinitionASTNode> getOutputs() {
        return outputs;
    }
}
