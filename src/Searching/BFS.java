package Searching;

import java.util.*;

public class BFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add edge (undirected graph)
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    public static void main(String[] args) {
        BFS bfsGraph = new BFS();

        // Build graph with edges
        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(1, 3);
        bfsGraph.addEdge(2, 4);
        bfsGraph.addEdge(2, 5);

        System.out.println("Graph created with adjacency list.");
    }
}
