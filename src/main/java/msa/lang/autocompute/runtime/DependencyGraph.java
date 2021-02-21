package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ds.DirectedAcyclicGraph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;

public class DependencyGraph {
    private final DirectedAcyclicGraph<String> graph;
    private final DirectedAcyclicGraph<String> reversed;


    public DependencyGraph() {
        this.graph = new DirectedAcyclicGraph<>();
        this.reversed = new DirectedAcyclicGraph<>();
    }

    public void add(String id) {
        graph.addVertex(id);
    }

    public void addDependency(String dependant, String dependency) {
        graph.addEdge(dependency, dependant); // dependency -> dependant: Represents the flow of data
        reversed.addEdge(dependant, dependency); // dependant -> dependency: Represents the hierarchy
    }

    public Set<String> getImmediateDependencies(String dependant) {
        return reversed.getAdjacencySet(dependant);
    }

    public Set<String> getImmediateDependants(String dependency) {
        return graph.getAdjacencySet(dependency);
    }

    public Set<String> getAllDependants(String dependency) {
        Set<String> allDependants = new LinkedHashSet<>();

        Deque<String> stack = new ArrayDeque<>();
        stack.add(dependency);

        while (!stack.isEmpty()) {
            String id = stack.poll();

            Set<String> dependants = getImmediateDependants(id);

            if (!id.equals(dependency)) {
                allDependants.add(id);
            }

            for (String dependant : dependants) {
                stack.push(dependant);
            }
        }
        return allDependants;
    }

    public Set<String> getAllUltimateDependants() {
        return graph.getSinkVertices();
    }

    public Set<String> getUltimateDependants(String dependency) {
        Set<String> ultimateDependants = new LinkedHashSet<>();

        Deque<String> stack = new ArrayDeque<>();
        stack.add(dependency);

        while (!stack.isEmpty()) {
            String id = stack.poll();

            Set<String> dependants = getImmediateDependants(id);

            if (dependants.isEmpty()) {
                ultimateDependants.add(id);
            } else {
                for (String dependant : dependants) {
                    stack.push(dependant);
                }
            }
        }

        return ultimateDependants;
    }
}

