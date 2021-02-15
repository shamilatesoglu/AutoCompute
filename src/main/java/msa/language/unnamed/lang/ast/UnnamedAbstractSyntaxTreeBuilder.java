package msa.language.unnamed.lang.ast;

import msa.language.unnamed.lang.ast.node.*;
import msa.language.unnamed.lang.cst.UnnamedBaseVisitor;
import msa.language.unnamed.lang.cst.UnnamedLexer;
import msa.language.unnamed.lang.cst.UnnamedParser;

import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class UnnamedAbstractSyntaxTreeBuilder extends UnnamedBaseVisitor<UnnamedAbstractSyntaxTreeNode> {

    @Override
    public UnnamedAbstractSyntaxTreeNode visitCompilationUnit(UnnamedParser.CompilationUnitContext ctx) {
        CompilationUnitASTNode node = new CompilationUnitASTNode();

        node.getEntities().addAll(ctx.entityDefinition().stream()
                .map(entityDefinitionContext -> (EntityASTNode) visitEntityDefinition(entityDefinitionContext))
                .collect(Collectors.toList()));

        node.getComputeCalls().addAll(ctx.computeCall().stream()
                .map(computeCallContext -> (ComputeCallASTNode) visitComputeCall(computeCallContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitEntityDefinition(UnnamedParser.EntityDefinitionContext ctx) {
        String id = ctx.identifier.getText();
        return new EntityASTNode(id, (EntityBodyASTNode) visitEntityBody(ctx.entityBody()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitEntityBody(UnnamedParser.EntityBodyContext ctx) {
        EntityBodyASTNode node = new EntityBodyASTNode();

        node.getProperties().addAll(ctx.propertyDefinition()
                .stream().map(propertyDefinitionCtx -> (PropertyASTNode) visitPropertyDefinition(propertyDefinitionCtx))
                .collect(Collectors.toList()));

        node.getConstraintSets().addAll(ctx.constraintsDefinition()
                .stream().map(constraintsDefinitionCtx -> (ConstraintSetASTNode) visitConstraintsDefinition(constraintsDefinitionCtx))
                .collect(Collectors.toList()));

        node.getInputs().addAll(ctx.inputDeclaration()
                .stream().map(inputDeclarationCtx -> (InputDeclarationASTNode) visitInputDeclaration(inputDeclarationCtx))
                .collect(Collectors.toList()));

        node.getLocals().addAll(ctx.localVariableDefinition()
                .stream().map(variableDeclarationCtx -> (VariableDefinitionASTNode) visitLocalVariableDefinition(variableDeclarationCtx))
                .collect(Collectors.toList()));

        node.getEntities().addAll(ctx.entityDefinition()
                .stream().map(entityDefinitionCtx -> (EntityASTNode) visitEntityDefinition(entityDefinitionCtx))
                .collect(Collectors.toList()));

        node.getOutputs().addAll(ctx.outputDefinition()
                .stream().map(outputDeclarationCtx -> (OutputDefinitionASTNode) visitOutputDefinition(outputDeclarationCtx))
                .collect(Collectors.toList()));

        return node;
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
                (GivenASTNode) visitGiven(ctx.given()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitOutputDefinition(UnnamedParser.OutputDefinitionContext ctx) {
        return new OutputDefinitionASTNode(
                ctx.identifier.getText(),
                (ExpressionASTNode) visit(ctx.expression()),
                (GivenASTNode) visitGiven(ctx.given())
        );
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitConstraintsDefinition(UnnamedParser.ConstraintsDefinitionContext ctx) {
        ConstraintSetASTNode node = new ConstraintSetASTNode(ctx.identifier.getText());

        node.getConstraints().addAll(ctx.constraint().stream()
                .map(constraintContext -> (ConstraintASTNode) visitConstraint(constraintContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitPropertyDefinition(UnnamedParser.PropertyDefinitionContext ctx) {
        String text = ctx.value.getText();
        Object value;
        if (text.startsWith("\""))
            value = text.substring(1, text.length() - 1);
        else
            value = Double.parseDouble(text);

        PropertyASTNode node = new PropertyASTNode(ctx.identifier.getText(), value);
        return node;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitGiven(UnnamedParser.GivenContext ctx) {
        GivenASTNode node = new GivenASTNode();
        if (ctx != null)
            node.getConstraints().addAll(ctx.constraint()
                    .stream().map(constraintCtx -> (ConstraintASTNode) visitConstraint(constraintCtx))
                    .collect(Collectors.toList()));
        return node;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitConstraint(UnnamedParser.ConstraintContext ctx) {
        return new ConstraintASTNode((ExpressionASTNode) visit(ctx.expression()), ctx.rationale != null ? ctx.rationale.getText() : null);
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
        return new ReferencingASTNode(ctx.reference().getText());
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitComputeCall(UnnamedParser.ComputeCallContext ctx) {
        ComputeCallASTNode node = new ComputeCallASTNode((ReferencingASTNode) visitReference(ctx.reference()));
        node.getInputs().addAll(ctx.inputDefinition().stream()
                .map(inputDefinitionContext -> (InputDefinitionASTNode) visitInputDefinition(inputDefinitionContext))
                .collect(Collectors.toList()));
        return node;
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitInputDefinition(UnnamedParser.InputDefinitionContext ctx) {
        return new InputDefinitionASTNode((ReferencingASTNode) visitReference(ctx.reference()), (ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public UnnamedAbstractSyntaxTreeNode visitReference(UnnamedParser.ReferenceContext ctx) {
        return new ReferencingASTNode(ctx.getText());
    }
}
