// Copyright (c) 2021 M. Samil Atesoglu
//
// Permission is hereby granted, free of charge, to any person obtaining a copy of
// this software and associated documentation files (the "Software"), to deal in
// the Software without restriction, including without limitation the rights to
// use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
// the Software, and to permit persons to whom the Software is furnished to do so,
// subject to the following conditions:
//
// The above copyright notice and this permission notice shall be included in all
// copies or substantial portions of the Software.
//
// THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
// IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
// FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
// COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
// IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
// CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

package msa.lang.autocompute.ds;

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
