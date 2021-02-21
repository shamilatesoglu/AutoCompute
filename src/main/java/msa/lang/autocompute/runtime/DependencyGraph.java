package msa.lang.autocompute.runtime;

import msa.lang.autocompute.ds.DirectedAcyclicGraph;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedHashSet;
import java.util.Set;

public class DependencyGraph {
    private final DirectedAcyclicGraph<String> dependants;
    private final DirectedAcyclicGraph<String> dependencies;


    public DependencyGraph() {
        this.dependants = new DirectedAcyclicGraph<>();
        this.dependencies = new DirectedAcyclicGraph<>();
    }

    public void add(String id) {
        dependants.addVertex(id);
    }

    public void addDependency(String dependant, String dependency) {
        dependants.addEdge(dependency, dependant); // dependency -> dependant: Represents the flow of data
        dependencies.addEdge(dependant, dependency); // dependant -> dependency: Represents the hierarchy
    }

    public Set<String> getImmediateDependencies(String dependant) {
        return dependencies.getAdjacencySet(dependant);
    }

    public Set<String> getImmediateDependants(String dependency) {
        return dependants.getAdjacencySet(dependency);
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
        return dependants.getSinkVertices();
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

