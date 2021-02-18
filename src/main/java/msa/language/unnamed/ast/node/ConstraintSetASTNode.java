package msa.language.unnamed.ast.node;

import msa.language.unnamed.semantics.StaticScope;

import java.util.ArrayList;
import java.util.List;

public class ConstraintSetASTNode extends IdentifiableASTNode {
    private final List<ConstraintASTNode> constraints;

    public ConstraintSetASTNode(String id) {
        super(id);
        constraints = new ArrayList<>();
    }

    public List<ConstraintASTNode> getConstraints() {
        return constraints;
    }
}
