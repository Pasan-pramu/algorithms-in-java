package Searching;

import java.util.*;

public class DFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();

    // Add edge to the graph
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // Recursive DFS function
    public void dfs(int node) {
        if (visited.contains(node)) return;

        // Mark node as visited and print it
        visited.add(node);
        System.out.print(node + " ");

        // Visit all unvisited neighbors
        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFS dfsGraph = new DFS();

        // Build a sample graph
        dfsGraph.addEdge(1, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(2, 4);
        dfsGraph.addEdge(2, 5);

        System.out.println("DFS Traversal starting from node 1:");
        dfsGraph.dfs(1);
    }
}
