package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.semantics.SymbolTable;

public class UnnamedInterpreter {

    private final DependencyGraph dependencyGraph;

    private final SymbolTable symbolTable;

    public UnnamedInterpreter(SymbolTable symbolTable) {
        // TODO: Interpreter should be able to handle multiple compilation units maybe?

        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
    }

    public void interpret(CompilationUnitASTNode root) {

        DependencyResolvingASTVisitor dependencyResolvingASTVisitor = new DependencyResolvingASTVisitor(dependencyGraph, symbolTable);
        dependencyResolvingASTVisitor.visit(root);

        ExecutorASTVisitor executor = new ExecutorASTVisitor(dependencyGraph, symbolTable);
        executor.visit(root);

    }
}
