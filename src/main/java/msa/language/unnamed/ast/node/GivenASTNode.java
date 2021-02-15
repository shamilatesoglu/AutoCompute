package msa.language.unnamed.ast.node;

import java.util.ArrayList;
import java.util.List;

public class GivenASTNode extends ExpressionASTNode {
    private List<ConstraintASTNode> constraints;

    public GivenASTNode( ) {
        this.constraints = new ArrayList<>();
    }

    public List<ConstraintASTNode> getConstraints() {
        return constraints;
    }
}
