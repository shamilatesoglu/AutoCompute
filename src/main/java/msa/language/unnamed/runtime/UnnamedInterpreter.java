package msa.language.unnamed.runtime;

import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.semantics.SymbolTable;

public class UnnamedInterpreter {


    private final DependencyGraph dependencyGraph;

    private final SymbolTable symbolTable;

    public UnnamedInterpreter(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
        this.dependencyGraph = new DependencyGraph();
    }

    public void interpret(CompilationUnitASTNode root) {

    }
}
