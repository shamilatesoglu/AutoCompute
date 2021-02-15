import msa.language.unnamed.ds.DirectedGraph;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

public class GraphTest {

    @Test
    public void whenCyclic_IsCyclicReturnsTrue() {
        DirectedGraph<String> g = new DirectedGraph<>();

        g.addEdge("1", "2");
        g.addEdge("2", "3");
        g.addEdge("3", "1");

        g.addEdge("4", "3");
        g.addEdge("4", "5");

        g.addEdge("5", "6");

        g.addEdge("6", "7");
        g.addEdge("7", "8");

        assert g.isCyclic();
    }
}
