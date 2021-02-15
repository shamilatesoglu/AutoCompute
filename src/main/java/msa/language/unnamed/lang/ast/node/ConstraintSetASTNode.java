package msa.language.unnamed.lang.ast.node;

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
