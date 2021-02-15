package msa.language.unnamed;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeBuilder;
import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.cst.UnnamedLexer;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.exec.UnnamedInterpreter;
import msa.language.unnamed.semantics.SemanticAnalyser;
import msa.language.unnamed.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Unnamed {

    private UnnamedInterpreter interpreter;

    public Unnamed() {
        interpreter = new UnnamedInterpreter();
    }

    public static void main(String[] args) {

        String source = FileUtils.readString(args[0]);
        new Unnamed().execute(source);

    }


    public void execute(String source) {
        // Lexical Analysis
        UnnamedLexer lexer = new UnnamedLexer(CharStreams.fromString(source));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        UnnamedParser parser = new UnnamedParser(tokenStream);
        UnnamedParser.CompilationUnitContext cst = parser.compilationUnit();
        CompilationUnitASTNode root = (CompilationUnitASTNode) new UnnamedAbstractSyntaxTreeBuilder().visitCompilationUnit(cst);

        // Semantic Analysis
        SemanticAnalyser semanticAnalyser = new SemanticAnalyser();
        semanticAnalyser.visit(root);

        // Interpretation
        interpreter.interpret(root);
    }

}
