package Searching;

import java.util.*;

public class BFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add edge to graph
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // BFS traversal using a queue
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        // Start with given node
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " "); // process node

            // Visit all unvisited neighbors
            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS bfsGraph = new BFS();

        // Build a sample graph
        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(1, 3);
        bfsGraph.addEdge(2, 4);
        bfsGraph.addEdge(2, 5);

        System.out.println("BFS Traversal starting from node 1:");
        bfsGraph.bfs(1);
    }
}
