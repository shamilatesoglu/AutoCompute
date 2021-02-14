package msa.language.unnamed.lang.ast;

import msa.language.unnamed.lang.ast.node.*;
import msa.language.unnamed.lang.cst.UnnamedBaseVisitor;
import msa.language.unnamed.lang.cst.UnnamedLexer;
import msa.language.unnamed.lang.cst.UnnamedParser;

import java.util.stream.Collectors;

public class UnnamedAbstractSyntaxTreeBuilder extends UnnamedBaseVisitor<UnnamedAbstractSyntaxTreeNode> {

    @Override
    public UnnamedAbstractSyntaxTreeNode visitCompilationUnit(UnnamedParser.CompilationUnitContext ctx) {
        return visit(ctx.entityDefinition());
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitEntityDefinition(UnnamedParser.EntityDefinitionContext ctx) {
        String id = ctx.identifier.getText();
        return new EntityASTNode(id, (EntityBodyASTNode) visitEntityBody(ctx.entityBody()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitEntityBody(UnnamedParser.EntityBodyContext ctx) {
        EntityBodyASTNode entityBodyASTNode = new EntityBodyASTNode();

        entityBodyASTNode.getInputs().addAll(ctx.inputDeclaration()
                .stream().map(inputDeclarationCtx -> (InputDeclarationASTNode) visitInputDeclaration(inputDeclarationCtx))
                .collect(Collectors.toList()));

        entityBodyASTNode.getLocals().addAll(ctx.localVariableDefinition()
                .stream().map(variableDeclarationCtx -> (VariableDefinitionASTNode) visitLocalVariableDefinition(variableDeclarationCtx))
                .collect(Collectors.toList()));

        entityBodyASTNode.getOutputs().addAll(ctx.outputDefinition()
                .stream().map(outputDeclarationCtx -> (OutputDefinitionASTNode) visitOutputDefinition(outputDeclarationCtx))
                .collect(Collectors.toList()));

        return entityBodyASTNode;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitInputDeclaration(UnnamedParser.InputDeclarationContext ctx) {
        return new InputDeclarationASTNode(ctx.identifier.getText());
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitLocalVariableDefinition(UnnamedParser.LocalVariableDefinitionContext ctx) {
        return new LocalVariableDefinitionASTNode(
                ctx.identifier.getText(),
                (ExpressionASTNode) visit(ctx.expression()),
                (ConstraintASTNode) visitConstraint(ctx.constraint()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitOutputDefinition(UnnamedParser.OutputDefinitionContext ctx) {
        return new OutputDefinitionASTNode(
                ctx.identifier.getText(),
                (ExpressionASTNode) visit(ctx.expression()),
                (ConstraintASTNode) visitConstraint(ctx.constraint())
        );
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitConstraint(UnnamedParser.ConstraintContext ctx) {
        if (ctx == null) return null;
        return new ConstraintASTNode((ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitRangeExpression(UnnamedParser.RangeExpressionContext ctx) {
        // TODO: This can be done by constraints, but it would be nice to have this I guess.
        return super.visitRangeExpression(ctx);
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitInfixExpression(UnnamedParser.InfixExpressionContext ctx) {
        return new InfixExpressionASTNode(visit(ctx.left), ctx.operation.getType(), visit(ctx.right));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitNumberExpression(UnnamedParser.NumberExpressionContext ctx) {
        String text = ctx.value.getText().toLowerCase();
        if (text.equals("true") || text.equals("false")) {
            boolean val = Boolean.parseBoolean(text);
            return new NumberASTNode(val ? 1.0 : 0.0);
        } else {
            return new NumberASTNode(Double.valueOf(text));
        }
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitConditionalExpression(UnnamedParser.ConditionalExpressionContext ctx) {

        return new ConditionalExpressionASTNode(
                (ExpressionASTNode) visit(ctx.check),
                (ExpressionASTNode) visit(ctx.first),
                (ExpressionASTNode) visit(ctx.second)
        );
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitParenthesisExpression(UnnamedParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitUnaryExpression(UnnamedParser.UnaryExpressionContext ctx) {
        switch (ctx.operation.getType()) {
            case UnnamedLexer.OPERATOR_ADD:
                return visit(ctx.expression());

            case UnnamedLexer.OPERATOR_SUB:
                return new NegationASTNode((ExpressionASTNode) visit(ctx.expression()));

            default:
                throw new IllegalArgumentException("Unary operator not supported: " + ctx.operation.getText());
        }
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitReferenceExpression(UnnamedParser.ReferenceExpressionContext ctx) {
        return new ReferencingASTNode(ctx.identifier.getText());
    }
}
