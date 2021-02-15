package msa.language.unnamed.lang.ast;

import msa.language.unnamed.lang.ast.node.*;

public abstract class UnnamedAbstractSyntaxTreeVisitor<T> {
    public abstract T visit(CompilationUnitASTNode node);

    public abstract T visit(ComputeCallASTNode node);

    public abstract T visit(ConditionalExpressionASTNode node);

    public abstract T visit(ConstraintASTNode node);

    public abstract T visit(ConstraintSetASTNode node);

    public abstract T visit(EntityASTNode node);

    public abstract T visit(EntityBodyASTNode node);

    public abstract T visit(GivenASTNode node);

    public abstract T visit(InfixExpressionASTNode node);

    public abstract T visit(InputDeclarationASTNode node);

    public abstract T visit(InputDefinitionASTNode node);

    public abstract T visit( VariableDefinitionASTNode node);

    public abstract T visit(NegationASTNode node);

    public abstract T visit(NumberASTNode node);

    public abstract T visit(OutputDefinitionASTNode node);

    public abstract T visit(PropertyASTNode node);

    public abstract T visit(ReferencingASTNode node);

    public T visit(UnnamedAbstractSyntaxTreeNode node) {
        if (node instanceof CompilationUnitASTNode) {
            return visit((CompilationUnitASTNode) node);
        }
        if (node instanceof ComputeCallASTNode) {
            return visit((ComputeCallASTNode) node);
        }
        if (node instanceof ConditionalExpressionASTNode) {
            return visit((ConditionalExpressionASTNode) node);
        }
        if (node instanceof ConstraintASTNode) {
            return visit((ConstraintASTNode) node);
        }
        if (node instanceof ConstraintSetASTNode) {
            return visit((ConstraintSetASTNode) node);
        }
        if (node instanceof EntityASTNode) {
            return visit((EntityASTNode) node);
        }
        if (node instanceof EntityBodyASTNode) {
            return visit((EntityBodyASTNode) node);
        }
        if (node instanceof GivenASTNode) {
            return visit((GivenASTNode) node);
        }
        if (node instanceof InfixExpressionASTNode) {
            return visit((InfixExpressionASTNode) node);
        }
        if (node instanceof InputDeclarationASTNode) {
            return visit((InputDeclarationASTNode) node);
        }
        if (node instanceof NegationASTNode) {
            return visit((NegationASTNode) node);
        }
        if (node instanceof NumberASTNode) {
            return visit((NumberASTNode) node);
        }
        if (node instanceof ReferencingASTNode) {
            return visit((ReferencingASTNode) node);
        }
        if (node instanceof InputDefinitionASTNode) {
            return visit((InputDefinitionASTNode) node);
        }
        if (node instanceof OutputDefinitionASTNode) {
            return visit((OutputDefinitionASTNode) node);
        }
        if (node instanceof PropertyASTNode) {
            return visit((PropertyASTNode) node);
        }
        if (node instanceof VariableDefinitionASTNode) {
            return visit((VariableDefinitionASTNode) node);
        }

        return null;
    }
}
