package Searching;

import java.util.*;

public class DFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add edge (undirected graph for simplicity)
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public static void main(String[] args) {
        DFS dfsGraph = new DFS();

        // Build graph with edges
        dfsGraph.addEdge(1, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(2, 4);
        dfsGraph.addEdge(2, 5);

        System.out.println("Graph created with adjacency list.");
    }
}
