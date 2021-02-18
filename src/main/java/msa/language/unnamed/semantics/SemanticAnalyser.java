package msa.language.unnamed.semantics;

import msa.language.unnamed.ast.node.*;
import msa.language.unnamed.semantics.exceptions.AlreadyDefinedException;
import msa.language.unnamed.semantics.exceptions.UndefinedSymbolException;

import java.util.ArrayDeque;
import java.util.Queue;

public class SemanticAnalyser extends ScopeAwareASTVisitor<Void> {

    private final SymbolTable symbolTable;

    private final Queue<String> referencesMade;

    /**
     * Analyses the program structure to catch possible semantic errors
     */
    public SemanticAnalyser() {
        symbolTable = new SymbolTable();
        referencesMade = new ArrayDeque<>();
    }

    private void declare(Symbol symbol) {
        declare(symbol, false);
    }

    private void declare(Symbol symbol, boolean allowRedefinition) {
        if ((!allowRedefinition) && symbolTable.contains(symbol.getName())) {
            throw new AlreadyDefinedException(symbol.getName(), symbolTable.lookup(symbol.getName()).getName());
        } else {
            symbolTable.insert(symbol);
        }
    }

    @Override
    public Void visit(CompilationUnitASTNode node) {
        super.visit(node);

        // Check for undefined references after constructing the symbol table.
        while (!referencesMade.isEmpty()) {
            String reference = referencesMade.poll();
            if (!symbolTable.contains(reference)) {
                throw new UndefinedSymbolException(reference);
            }
        }

        return null;
    }

    @Override
    public Void visit(ConstraintSetASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(EntityASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(InputDeclarationASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return null;
    }

    @Override
    public Void visit(VariableDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol, true);

        return super.visit(node);
    }

    @Override
    public Void visit(OutputDefinitionASTNode node) {
        String name = node.getId();

        Symbol symbol = new Symbol(getFullReference(name), node);
        declare(symbol);

        return super.visit(node);
    }

    @Override
    public Void visit(ReferencingASTNode node) {

        // Add to a queue to check for later.
        // TODO: Multiples of same references may exist, maybe use a set?
        referencesMade.add(getFullReference(node.getReferencedId()));

        return null;
    }


    public SymbolTable getSymbolTable() {
        return symbolTable;
    }
}
