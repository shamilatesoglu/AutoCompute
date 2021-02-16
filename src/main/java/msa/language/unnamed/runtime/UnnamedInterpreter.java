package msa.language.unnamed.exec;

import msa.language.unnamed.ast.node.CompilationUnitASTNode;

public class UnnamedInterpreter {


    private final DependencyGraph dependencyGraph;
    

    public UnnamedInterpreter() {
        dependencyGraph = new DependencyGraph();
    }

    public void interpret(CompilationUnitASTNode root) {

    }
}
