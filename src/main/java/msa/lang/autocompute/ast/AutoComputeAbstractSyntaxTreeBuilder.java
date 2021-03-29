// Copyright (c) 2021 M. Samil Atesoglu
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package msa.lang.autocompute.ast;

import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.cst.AutoComputeBaseVisitor;
import msa.lang.autocompute.cst.AutoComputeLexer;
import msa.lang.autocompute.cst.AutoComputeParser;

import java.util.stream.Collectors;

public class AutoComputeAbstractSyntaxTreeBuilder extends AutoComputeBaseVisitor<AutoComputeAbstractSyntaxTreeNode> {

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitCompilationUnit(AutoComputeParser.CompilationUnitContext ctx) {
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
    public AutoComputeAbstractSyntaxTreeNode visitEntityDefinition(AutoComputeParser.EntityDefinitionContext ctx) {
        String id = ctx.identifier.getText();
        return new EntityASTNode(id, (EntityBodyASTNode) visitEntityBody(ctx.entityBody()));
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitEntityBody(AutoComputeParser.EntityBodyContext ctx) {
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
    public AutoComputeAbstractSyntaxTreeNode visitInputDeclaration(AutoComputeParser.InputDeclarationContext ctx) {
        return new InputDeclarationASTNode(ctx.identifier.getText());
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitLocalVariableDefinition(AutoComputeParser.LocalVariableDefinitionContext ctx) {
        return new VariableDefinitionASTNode(
                ctx.identifier.getText(),
                (ExpressionASTNode) visit(ctx.expression()),
                (GivenASTNode) visitGiven(ctx.given()));
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitOutputDefinition(AutoComputeParser.OutputDefinitionContext ctx) {
        return new OutputDefinitionASTNode(
                ctx.identifier.getText(),
                (ExpressionASTNode) visit(ctx.expression()),
                (GivenASTNode) visitGiven(ctx.given())
        );
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitConstraintsDefinition(AutoComputeParser.ConstraintsDefinitionContext ctx) {
        ConstraintSetASTNode node = new ConstraintSetASTNode(ctx.identifier.getText());

        node.getConstraints().addAll(ctx.constraint().stream()
                .map(constraintContext -> (ConstraintASTNode) visitConstraint(constraintContext))
                .collect(Collectors.toList()));

        return node;
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitPropertyDefinition(AutoComputeParser.PropertyDefinitionContext ctx) {
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
    public AutoComputeAbstractSyntaxTreeNode visitGiven(AutoComputeParser.GivenContext ctx) {
        GivenASTNode node = new GivenASTNode();
        if (ctx != null) {
            node.getConstraints().addAll(ctx.constraint()
                    .stream().map(constraintCtx -> (ConstraintASTNode) visitConstraint(constraintCtx))
                    .collect(Collectors.toList()));
            if (ctx.reference() != null) {
                node.setConstraintSetReference(ctx.reference().getText());
            }
        }
        return node;
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitConstraint(AutoComputeParser.ConstraintContext ctx) {
        return new ConstraintASTNode((ExpressionASTNode) visit(ctx.expression()), ctx.rationale != null ? ctx.rationale.getText() : null);
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitRangeExpression(AutoComputeParser.RangeExpressionContext ctx) {
        // TODO: This can be done by constraints, but it would be nice to have this I guess.
        return super.visitRangeExpression(ctx);
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitInfixExpression(AutoComputeParser.InfixExpressionContext ctx) {
        return new InfixExpressionASTNode(visit(ctx.left), ctx.operation.getType(), visit(ctx.right));
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitNumberExpression(AutoComputeParser.NumberExpressionContext ctx) {
        String text = ctx.value.getText().toLowerCase();
        if (text.equals("true") || text.equals("false")) {
            boolean val = Boolean.parseBoolean(text);
            return new NumberASTNode(val ? 1.0 : 0.0);
        } else {
            return new NumberASTNode(Double.valueOf(text));
        }
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitConditionalExpression(AutoComputeParser.ConditionalExpressionContext ctx) {

        return new ConditionalExpressionASTNode(
                (ExpressionASTNode) visit(ctx.check),
                (ExpressionASTNode) visit(ctx.first),
                (ExpressionASTNode) visit(ctx.second)
        );
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitParenthesisExpression(AutoComputeParser.ParenthesisExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitUnaryExpression(AutoComputeParser.UnaryExpressionContext ctx) {
        switch (ctx.operation.getType()) {
            case AutoComputeLexer.OPERATOR_ADD:
                return visit(ctx.expression());

            case AutoComputeLexer.OPERATOR_SUB:
                return new NegationASTNode((ExpressionASTNode) visit(ctx.expression()));

            default:
                throw new IllegalArgumentException("Unary operator not supported: " + ctx.operation.getText());
        }
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitReferenceExpression(AutoComputeParser.ReferenceExpressionContext ctx) {
        return new ReferencingASTNode(ctx.reference().getText());
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitComputeCall(AutoComputeParser.ComputeCallContext ctx) {
        ComputeCallASTNode node = new ComputeCallASTNode((ReferencingASTNode) visitReference(ctx.reference()));
        node.getInputs().addAll(ctx.inputDefinition().stream()
                .map(inputDefinitionContext -> (InputDefinitionASTNode) visitInputDefinition(inputDefinitionContext))
                .collect(Collectors.toList()));
        return node;
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitInputDefinition(AutoComputeParser.InputDefinitionContext ctx) {
        return new InputDefinitionASTNode((ReferencingASTNode) visitReference(ctx.reference()), (ExpressionASTNode) visit(ctx.expression()));
    }

    @Override
    public AutoComputeAbstractSyntaxTreeNode visitReference(AutoComputeParser.ReferenceContext ctx) {
        return new ReferencingASTNode(ctx.getText());
    }
}
