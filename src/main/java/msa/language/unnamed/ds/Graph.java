package msa.language.unnamed.ds;

import java.util.List;
import java.util.Set;

public interface Graph<V> extends Iterable<V> {

    void addVertex(V v);

    void addEdge(V v1, V v2);

    void removeVertex(V v);

    void removeEdge(V v1, V v2);

    boolean isAdjacent(V v1, V v2);

    boolean contains(V v);

    int degree(V v);

    List<Pair<V, V>> getBridges();

    Iterable<V> adjacentVertices(V v);

    Set<V> getAdjacencySet(V v);

    /**
     * @return All the vertices of the graph. It is not ordered.
     */
    Iterable<V> vertices();

    int getNumberOfVertices();

    int getNumberOfEdges();

    int countParallelEdges();

    boolean hasHamiltonianPath();

}
