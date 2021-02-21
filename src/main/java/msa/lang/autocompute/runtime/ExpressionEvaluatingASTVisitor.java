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
