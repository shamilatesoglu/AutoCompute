package msa.language.unnamed.lang.ast.node;

public class LocalVariableDefinitionASTNode extends VariableDefinitionASTNode {

    public LocalVariableDefinitionASTNode(String name, ExpressionASTNode expressionASTNode, ConstraintASTNode constraintASTNode) {
        super(name, expressionASTNode, constraintASTNode);
    }

}
