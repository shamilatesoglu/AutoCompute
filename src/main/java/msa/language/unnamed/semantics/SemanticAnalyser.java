package msa.language.unnamed.semantics;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeVisitor;
import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.semantics.exceptions.AlreadyDefinedException;
import msa.language.unnamed.semantics.exceptions.UndefinedSymbolException;

import java.util.ArrayDeque;
import java.util.Queue;

public class SemanticAnalyser extends UnnamedAbstractSyntaxTreeVisitor<Void> {

    private StaticScope currentScope;
    private StaticScope globalScope;

    private final SymbolTable symbolTable;

    private final Queue<String> referencesMade;

    /**
     * Analyses the program structure to catch possible semantic errors
     */
    public SemanticAnalyser() {
        symbolTable = new SymbolTable();
        referencesMade = new ArrayDeque<>();
    }

    private String getReferenceForId(String id) {
        String scopeOperator = UnnamedParser.VOCABULARY.getLiteralName(UnnamedParser.OPERATOR_SCOPE);
        scopeOperator = scopeOperator.substring(1, scopeOperator.length() - 1);
        String currentScopeName = currentScope.getScopeName();

        return currentScopeName == null ? id : currentScopeName + scopeOperator + id;
    }

    private void insertNewDeclaration(Symbol symbol) {
        insertNewDeclaration(symbol, false);
    }

    private void insertNewDeclaration(Symbol symbol, boolean allowRedefinition) {
        if ((!allowRedefinition) && symbolTable.contains(symbol.getName())) {
            throw new AlreadyDefinedException(symbol.getName(), symbolTable.lookup(symbol.getName()).getName());
        } else {
            symbolTable.insert(symbol);
        }
    }

    @Override
    public Void visit(CompilationUnitASTNode node) {
        globalScope = new StaticScope(null, null);
        currentScope = globalScope;


        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        currentScope = globalScope;

        for (ComputeCallASTNode computeCall : node.getComputeCalls()) {
            visit(computeCall);
        }

        // Check for undefined references after constructing the symbol table.
        while (!referencesMade.isEmpty()) {
            String reference = referencesMade.poll();
            if (!symbolTable.contains(reference)){
                throw new UndefinedSymbolException(reference);
            }
        }

        return null;
    }

    @Override
    public Void visit(ComputeCallASTNode node) {

        visit(node.getReference());

        String reference = node.getReference().getReferencedId();

        currentScope = new StaticScope(reference, currentScope);

        for (InputDefinitionASTNode inputDefinitionASTNode : node.getInputs()) {
            visit(inputDefinitionASTNode);
        }

        return null;
    }

    @Override
    public Void visit(ConditionalExpressionASTNode node) {

        visit(node.getCheck());
        visit(node.getFirst());
        visit(node.getSecond());

        return null;
    }

    @Override
    public Void visit(ConstraintASTNode node) {

        // Scope will be dynamically bounded.
        // So, no checking for references.
        // visit(node.getConstraint());

        return null;
    }

    @Override
    public Void visit(ConstraintSetASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), node);
        insertNewDeclaration(symbol);

        for (ConstraintASTNode constraint : node.getConstraints()) {
            visit(constraint);
        }

        return null;
    }

    @Override
    public Void visit(EntityASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), node);
        insertNewDeclaration(symbol);

        currentScope = new StaticScope(getReferenceForId(name), currentScope);

        visit(node.getBlockASTNode());


        return null;
    }

    @Override
    public Void visit(EntityBodyASTNode node) {

        for (ConstraintSetASTNode constraintSet : node.getConstraintSets()) {
            visit(constraintSet);
        }

        for (PropertyASTNode property : node.getProperties()) {
            visit(property);
        }

        for (InputDeclarationASTNode input : node.getInputs()) {
            visit(input);
        }

        for (VariableDefinitionASTNode local : node.getLocals()) {
            visit(local);
        }

        for (EntityASTNode entity : node.getEntities()) {
            visit(entity);
        }

        for (OutputDefinitionASTNode output : node.getOutputs()) {
            visit(output);
        }

        currentScope = currentScope.getEnclosingScope();

        return null;
    }

    @Override
    public Void visit(GivenASTNode node) {
        for (ConstraintASTNode constraint : node.getConstraints()) {
            visit(constraint);
        }

        return null;
    }

    @Override
    public Void visit(InfixExpressionASTNode node) {
        visit(node.getLeft());
        visit(node.getRight());

        return null;
    }

    @Override
    public Void visit(InputDeclarationASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), node);
        insertNewDeclaration(symbol);

        return null;
    }

    @Override
    public Void visit(InputDefinitionASTNode node) {

        visit(node.getReference());
        visit(node.getExpression());

        return null;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), node);
        insertNewDeclaration(symbol, true);

        visit(node.getExpressionASTNode());
        visit(node.getGivenASTNode());

        return null;
    }

    @Override
    public Void visit(NegationASTNode node) {
        visit(node.getInnerNode());
        return null;
    }

    @Override
    public Void visit(NumberASTNode node) {
        return null;
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), node);
        insertNewDeclaration(symbol);

        visit(node.getExpressionASTNode());
        visit(node.getGivenASTNode());

        return null;
    }

    @Override
    public Void visit(PropertyASTNode node) {


        return null;
    }

    @Override
    public Void visit(ReferencingASTNode node) {

        // Add to a queue to check for later.
        // TODO: Multiples of same references may exist, maybe use a set?
        referencesMade.add(getReferenceForId(node.getReferencedId()));

        return null;
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
