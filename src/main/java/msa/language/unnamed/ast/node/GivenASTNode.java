package msa.language.unnamed.ast.node;

import java.util.ArrayList;
import java.util.List;

public class GivenASTNode extends ExpressionASTNode {
    private final List<ConstraintASTNode> constraints;

    private String constraintSetReference;

    public GivenASTNode() {
        this.constraints = new ArrayList<>();
    }

    public String getConstraintSetReference() {
        return constraintSetReference;
    }

    public void setConstraintSetReference(String constraintSetReference) {
        this.constraintSetReference = constraintSetReference;
    }

    public List<ConstraintASTNode> getConstraints() {
        return constraints;
    }
}
