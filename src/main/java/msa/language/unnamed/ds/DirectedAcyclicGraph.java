package msa.language.unnamed.ds;

public class DirectedAcyclicGraph<V> extends DirectedGraph<V> {

    @Override
    public void addVertex(V v) {
        // TODO: Check if cyclic upon addition.
        super.addVertex(v);
    }
}
