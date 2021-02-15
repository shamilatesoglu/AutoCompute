package msa.language.unnamed.semantics;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeVisitor;
import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.semantics.exceptions.AlreadyDefinedException;
import msa.language.unnamed.semantics.exceptions.UndefinedSymbolException;

public class SemanticAnalyser extends UnnamedAbstractSyntaxTreeVisitor<Void> {

    private StaticScope currentScope;
    private StaticScope globalScope;

    private final SymbolTable symbolTable;

    /**
     * Analyses the program structure to catch possible semantic errors
     */
    public SemanticAnalyser() {
        symbolTable = new SymbolTable();
    }

    public void setCurrentScope(StaticScope currentScope) {
        this.currentScope = currentScope;
    }

    public StaticScope getCurrentScope() {
        return currentScope;
    }

    public StaticScope getGlobalScope() {
        return globalScope;
    }

    private String getReferenceForId(String id) {
        String scopeOperator = UnnamedParser.VOCABULARY.getLiteralName(UnnamedParser.OPERATOR_SCOPE);
        scopeOperator = scopeOperator.substring(1, scopeOperator.length() - 1);
        String currentScopeName = currentScope.getScopeName();

        return currentScopeName == null ? id : currentScopeName + scopeOperator + id;
    }

    private void insertNewDeclaration(Symbol symbol) {
        if (symbolTable.contains(symbol.getName())) {
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

        return null;
    }

    @Override
    public Void visit(ComputeCallASTNode node) {

        visit(node.getReference());

        String reference = node.getReference().getReferencedId();

        if (!symbolTable.contains(reference)) throw new UndefinedSymbolException(reference);
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

        visit(node.getConstraint());

        return null;
    }

    @Override
    public Void visit(ConstraintSetASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), Symbol.Type.CONSTRAINT_SET);
        insertNewDeclaration(symbol);

        for (ConstraintASTNode constraint : node.getConstraints()) {
            visit(constraint);
        }

        return null;
    }

    @Override
    public Void visit(EntityASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), Symbol.Type.ENTITY);
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

        Symbol symbol = new Symbol(getReferenceForId(name), Symbol.Type.INPUT);
        insertNewDeclaration(symbol);

        return null;
    }

    @Override
    public Void visit(InputDefinitionASTNode node) {

        String reference = node.getId();

        reference = getReferenceForId(reference);

        if (!symbolTable.contains(reference)) throw new UndefinedSymbolException(reference);

        visit(node.getExpression());

        return null;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getReferenceForId(name), Symbol.Type.INTERMEDIATE);
        insertNewDeclaration(symbol);

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

        Symbol symbol = new Symbol(getReferenceForId(name), Symbol.Type.OUTPUT);
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
        // TODO: Probably shouldn't try to resolve while building symbol table.
        return null;
    }

}
