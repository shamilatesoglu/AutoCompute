package msa.language.unnamed.ds;


import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DirectedGraph<V> implements Graph<V> {

    protected Map<V, LinkedHashSet<V>> adj;

    protected V origin;

    public DirectedGraph() {
        this(null);
    }

    public DirectedGraph(V origin) {
        adj = new LinkedHashMap<>();
        addVertex(origin);
    }

    public List<Set<V>> getStronglyConnectedComponents() {
        List<Set<V>> stronglyConnectedComponents = new ArrayList<>();

        AtomicInteger index = new AtomicInteger();

        Stack<TarjanVertexWrapper<V>> S = new Stack<>();

        List<TarjanVertexWrapper<V>> vertices = new ArrayList<>();
        for (V vertex : adj.keySet()) {
            vertices.add(new TarjanVertexWrapper<>(vertex));

        }

        List<Edge<V>> edges = new LinkedList<>();

        for (TarjanVertexWrapper<V> v : vertices) {
            for (TarjanVertexWrapper<V> w : vertices) {
                if (isAdjacent(v.v, w.v)) edges.add(new Edge<>(v, w));
            }
        }

        for (TarjanVertexWrapper<V> vertex : vertices) {
            if (vertex.index == TarjanVertexWrapper.UNDEFINED) {
                strongConnect(vertex, index, edges, S, stronglyConnectedComponents);
            }
        }

        return stronglyConnectedComponents;
    }

    private void strongConnect(TarjanVertexWrapper<V> v, AtomicInteger index, List<Edge<V>> edges,
                               Stack<TarjanVertexWrapper<V>> S, List<Set<V>> stronglyConnectedComponents) {
        v.index = index.get();
        v.lowLink = index.getAndIncrement();
        S.push(v);
        v.onStack = true;

        for (Edge<V> edge : edges) {
            if (edge.w.index == TarjanVertexWrapper.UNDEFINED) {
                // Successor w has not yet been visited; recurse on it
                strongConnect(edge.w, index, edges, S, stronglyConnectedComponents);
                edge.v.lowLink = Math.min(edge.v.lowLink, edge.w.lowLink);
            } else if (edge.w.onStack) {
                // Successor w is in stack S and hence in the current SCC
                // If w is not on stack, then (v, w) is an edge pointing to an SCC already found and must be ignored
                // Note: The next line may look odd - but is correct.
                // It says w.index not w.lowlink; that is deliberate and from the original paper
                edge.v.lowLink= Math.min(edge.v.lowLink, edge.w.index);
            }
        }

        if (v.lowLink == v.index) {
            Set<V> stronglyConnectedComponent = new LinkedHashSet<>();
            while(!S.isEmpty()) {
                TarjanVertexWrapper<V> w = S.pop();
                w.onStack = false;
                stronglyConnectedComponent.add(w.v);
                if (w.v.equals(v.v)) break;
            }
            stronglyConnectedComponents.add(stronglyConnectedComponent);
        }
    }

    private static class TarjanVertexWrapper<V> {
        private static final int UNDEFINED = -1;

        final V v;
        int lowLink;
        int index;
        boolean onStack;

        TarjanVertexWrapper(V vertex) {
            this.v = vertex;
            index = UNDEFINED;
        }
    }

    private static class Edge<V> {
        TarjanVertexWrapper<V> v;
        TarjanVertexWrapper<V> w;

        public Edge(TarjanVertexWrapper<V> v, TarjanVertexWrapper<V> w) {
            this.v = v;
            this.w = w;
        }
    }
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
    public Iterator<V> iterator() { return null; }

}