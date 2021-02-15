package msa.language.unnamed.ds;

import java.util.*;

public class DirectedAcyclicGraph<V> extends DirectedGraph<V> {

    @Override
    public void addEdge(V from, V to) {
        super.addEdge(from, to);
        if (isCyclic()) {
            throw new IllegalArgumentException(String.format("Adding edge (%s -> %s) creates a cycle!",
                    from.toString(), to.toString()));
        }
    }

    @Override
    public Iterator<V> iterator() {
        return new TopologicalOrderTraversal().iterator();
    }

    private class TopologicalOrderTraversal implements Iterable<V> {
        private final HashMap<V, Boolean> visited;
        private final LinkedList<V> reversePostOrder;

        public TopologicalOrderTraversal() {
            reversePostOrder = new LinkedList<>();
            visited = new HashMap<>(getNumberOfVertices(), 2);
            for (V v : vertices())
                visited.put(v, false);
            for (V v : vertices())
                if (!visited.get(v)) dfs(v);
        }

        private void dfs(V v) {
            visited.put(v, true);
            for (V w : DirectedAcyclicGraph.this.adjacentVertices(v))
                if (!visited.get(w)) dfs(w);
            reversePostOrder.push(v);
        }

        @Override
        public Iterator<V> iterator() {
            return reversePostOrder.iterator();
        }
    }
}
