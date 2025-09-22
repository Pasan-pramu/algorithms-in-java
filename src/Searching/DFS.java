package Searching;

import java.util.*;

public class DFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();
    private Set<Integer> visited = new HashSet<>();

    // Add edge
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // DFS traversal
    public void dfs(int node) {
        if (visited.contains(node)) return;

        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
            dfs(neighbor);
        }
    }

    public static void main(String[] args) {
        DFS dfsGraph = new DFS();

        dfsGraph.addEdge(1, 2);
        dfsGraph.addEdge(1, 3);
        dfsGraph.addEdge(2, 4);
        dfsGraph.addEdge(2, 5);

        System.out.print("DFS traversal starting from node 1: ");
        dfsGraph.dfs(1);
    }
}
