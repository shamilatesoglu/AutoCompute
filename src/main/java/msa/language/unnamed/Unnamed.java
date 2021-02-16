package msa.language.unnamed;

import msa.language.unnamed.ast.UnnamedAbstractSyntaxTreeBuilder;
import msa.language.unnamed.ast.node.CompilationUnitASTNode;
import msa.language.unnamed.cst.UnnamedLexer;
import msa.language.unnamed.cst.UnnamedParser;
import msa.language.unnamed.runtime.UnnamedInterpreter;
import msa.language.unnamed.semantics.SemanticAnalyser;
import msa.language.unnamed.utils.FileUtils;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class Unnamed {
    public Unnamed() {

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

        UnnamedInterpreter interpreter = new UnnamedInterpreter(semanticAnalyser.getSymbolTable());
        interpreter.interpret(root);
    }

}
