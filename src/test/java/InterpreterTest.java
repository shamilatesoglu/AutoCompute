import msa.language.unnamed.UnnamedInterpreter;
import msa.language.unnamed.utils.FileUtils;
import org.junit.jupiter.api.Test;

public class InterpreterTest {
    @Test
    public void testParseTree() {


        String source = FileUtils.readString("grammar/sample.txt");

        UnnamedInterpreter.getInstance().interpret(source);
    }
}
