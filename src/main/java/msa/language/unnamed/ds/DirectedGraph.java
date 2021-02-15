package msa.language.unnamed.ds;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class DirectedGraph<V> implements Graph<V> {

    protected HashMap<V, LinkedHashSet<V>> adj;

    protected V origin;

    protected Graph<V> reference;

    public DirectedGraph() {
        this(null);
    }

    public DirectedGraph(V origin) {
        adj = new HashMap<>();
        addVertex(origin);
        reference = this;
    }

    @Override
    public void addVertex(V v) {
        if (v == null) return;
        if (adj.containsKey(v)) return;
        if (origin == null) origin = v;
        adj.put(v, new LinkedHashSet<>());
    }

    @Override
    public void addEdge(V from, V to) {
        if (!adj.containsKey(from)) addVertex(from);
        if (!adj.containsKey(to)) addVertex(to);
        adj.get(from).add(to);
    }

    @Override
    public void removeVertex(V v) {
        if (!adj.containsKey(v)) return;

        int outDegree = adj.get(v).size();
        adj.remove(v); // Remove outgoing connections.

        int inDegree = 0;
        for (V vertex : adj.keySet()) {
            if (adj.get(vertex).contains(v)) {
                adj.get(vertex).remove(v); // Remove incoming connections.
                inDegree++;
            }
        }
    }

    @Override
    public void removeEdge(V from, V to) {
        if (!adj.containsKey(from) || !adj.containsKey(to)) return;
        adj.get(from).remove(to);
    }

    @Override
    public boolean contains(V v) {
        return adj.containsKey(v);
    }

    @Override
    public boolean isAdjacent(V v1, V v2) {
        if (!adj.containsKey(v1))
            throw new NoSuchElementException(v1 + " does not exist in the graph.");
        if (!adj.containsKey(v2))
            throw new NoSuchElementException(v2 + " does not exist in the graph.");
        return adj.get(v1).contains(v2);
    }

    @Override
    public boolean hasHamiltonianPath() {
        Iterable<V> topologicalOrder = new TopologicalOrderTraversal();
        V prev = null;
        for (V v : topologicalOrder) {
            if (prev != null) {
                if (!isAdjacent(prev, v)) {
                    return false;
                }
            }
            prev = v;
        }
        return true;
    }

    @Override
    public int degree(V v) {
        int outDegree = adj.get(v).size();
        int inDegree = 0;
        for (V vertex : adj.keySet()) {
            if (!v.equals(vertex) && adj.get(vertex).contains(v)) {
                inDegree++;
            }
        }
        return inDegree + outDegree;
    }

    @Override
    public int countParallelEdges() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public List<Pair<V, V>> getBridges() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    @Override
    public Iterable<V> adjacentVertices(V v) {
        return adj.get(v);
    }

    @Override
    public Set<V> getAdjacencySet(V v) {
        return adj.get(v);
    }

    public Set<V> getRoots() {
        Set<V> roots = new HashSet<>();

        for (V v : this) {
            if (getAdjacencySet(v).isEmpty())
                roots.add(v);
        }

        return roots;
    }

    @Override
    public Iterable<V> vertices() {
        return adj.keySet();
    }

    @Override
    public int getNumberOfVertices() {
        return adj.size();
    }

    @Override
    public int getNumberOfEdges() {
        int numberOfEdges = 0;

        for (V vertex : adj.keySet()) {
            numberOfEdges += adj.get(vertex).size();
        }

        return numberOfEdges;
    }

    @Override
    public Iterator<V> iterator() {
        return new TopologicalOrderTraversal().iterator();
    }

    /**
     * Assumes the graph is a directed acyclic graph.
     * TODO: Implement DirectedAcyclicGraph and use this there.
     */
    private class TopologicalOrderTraversal implements Iterable<V> {
        private HashMap<V, Boolean> visited;
        private LinkedList<V> reversePostOrder;

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
            for (V w : reference.adjacentVertices(v))
                if (!visited.get(w)) dfs(w);
            reversePostOrder.push(v);
        }

        @Override
        public Iterator<V> iterator() {
            return reversePostOrder.iterator();
        }
    }
}