import msa.language.unnamed.Unnamed;
import msa.language.unnamed.exec.UnnamedInterpreter;
import msa.language.unnamed.utils.FileUtils;
import org.junit.jupiter.api.Test;

public class InterpreterTest {
    @Test
    public void testParseTree() {


        String source = FileUtils.readString("grammar/yks.txt");

        Unnamed instance = new Unnamed();
        instance.execute(source);
    }
}
