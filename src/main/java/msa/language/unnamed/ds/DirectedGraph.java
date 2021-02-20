package msa.language.unnamed.ds;


import msa.language.unnamed.algorithm.TarjanStrongConnectivityInspector;

import java.util.*;

public class DirectedGraph<V> implements Graph<V> {

    protected Map<V, Set<V>> adj;

    protected V origin;

    private final TarjanStrongConnectivityInspector<V> strongConnectivityInspector;

    public DirectedGraph() {
        this(null);
    }

    public DirectedGraph(V origin) {
        adj = new LinkedHashMap<>();
        addVertex(origin);

        strongConnectivityInspector = new TarjanStrongConnectivityInspector<>();
    }

    public Set<V> getRoots() {
        Set<V> roots = new LinkedHashSet<>();
        for (V vertex : adj.keySet()) {
            if (inDegree(vertex) == 0) {
                roots.add(vertex);
            }
        }
        return roots;
    }

    public boolean isCyclic() {
        Set<Set<V>> stronglyConnectedComponents = strongConnectivityInspector.getStronglyConnectedComponents();
        for (Set<V> scc : stronglyConnectedComponents) {
            if (scc.size() > 1)
                return true;
        }

        return false;
    }

    @Override
    public void addVertex(V v) {
        if (v == null) return;
        if (adj.containsKey(v)) return;
        if (origin == null) origin = v;
        adj.put(v, new LinkedHashSet<>());
        strongConnectivityInspector.addVertex(v);
    }

    @Override
    public void addEdge(V from, V to) {
        if (!adj.containsKey(from)) addVertex(from);
        if (!adj.containsKey(to)) addVertex(to);
        adj.get(from).add(to);
        strongConnectivityInspector.addEdge(from, to);
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
            throw new NoSuchElementException(v1.toString() + " does not exist in the graph.");
        if (!adj.containsKey(v2))
            throw new NoSuchElementException(v2.toString() + " does not exist in the graph.");
        return adj.get(v1).contains(v2);
    }

    @Override
    public boolean hasHamiltonianPath() {
        throw new UnsupportedOperationException("Not implemented yet.");
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
        throw new UnsupportedOperationException("No parallel edge is allowed in this implementation.");
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

    public Set<V> getSinkVertices() {
        Set<V> sinkVertices = new LinkedHashSet<>();

        for (V v : this) {
            if (outDegree(v) == 0)
                sinkVertices.add(v);
        }

        return sinkVertices;
    }

    public int outDegree(V v) {
        return getAdjacencySet(v).size();
    }

    public int inDegree(V v) {
        int inDegree = 0;

        for (Set<V> adjacencyList : adj.values()) {
            if (adjacencyList.contains(v)) inDegree++;
        }

        return inDegree;
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
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}