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

package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ast.node.*;
import msa.lang.autocompute.cst.AutoComputeLexer;
import msa.lang.autocompute.runtime.exceptions.DependencyNotFoundException;
import msa.lang.autocompute.semantics.ScopeAwareASTVisitor;

import java.util.Map;

public class ExpressionEvaluatingASTVisitor extends ScopeAwareASTVisitor<Double> {

    private final Map<String, Double> inputs;

    public ExpressionEvaluatingASTVisitor(Map<String, Double> inputs) {
        this.inputs = inputs;
    }

    @Override
    public Double visit(ConditionalExpressionASTNode node) {
        return visit(node.getCheck()) > 0 ? visit(node.getFirst()) : visit(node.getSecond());
    }

    @Override
    public Double visit(InfixExpressionASTNode node) {

        switch (node.getOperator()) {
            case AutoComputeLexer.OPERATOR_ADD:
                return visit(node.getLeft()) + visit(node.getRight());
            case AutoComputeLexer.OPERATOR_SUB:
                return visit(node.getLeft()) - visit(node.getRight());
            case AutoComputeLexer.OPERATOR_MUL:
                return visit(node.getLeft()) * visit(node.getRight());
            case AutoComputeLexer.OPERATOR_DIV:
                return visit(node.getLeft()) / visit(node.getRight());
            case AutoComputeLexer.OPERATOR_EXP:
                return Math.pow(visit(node.getLeft()), visit(node.getRight()));
            case AutoComputeLexer.OPERATOR_AND:
                return (visit(node.getLeft()) == 1.0) && (visit(node.getRight()) == 1.0) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_OR:
                return (visit(node.getLeft()) == 1.0) || (visit(node.getRight()) == 1.0) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_GT:
                return (visit(node.getLeft()) > visit(node.getRight())) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_LT:
                return (visit(node.getLeft()) < visit(node.getRight())) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_GTEQ:
                return (visit(node.getLeft()) >= visit(node.getRight())) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_LTEQ:
                return (visit(node.getLeft()) <= visit(node.getRight())) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_EQ:
                return (visit(node.getLeft()).equals(visit(node.getRight()))) ? 1.0 : 0.0;
            case AutoComputeLexer.OPERATOR_NEQ:
                return (!visit(node.getLeft()).equals(visit(node.getRight()))) ? 1.0 : 0.0;
        }
        return 0.0;
    }

    @Override
    public Double visit(NegationASTNode node) {
        return -visit(node.getInnerNode());
    }

    @Override
    public Double visit(NumberASTNode node) {
        return node.getValue();
    }

    @Override
    public Double visit(ReferencingASTNode node) {
        String reference = getFullReference(node.getReferencedId());
        if (!inputs.containsKey(reference))
            throw new DependencyNotFoundException(reference);
        return inputs.get(reference);
    }
}
