package Searching;

import java.util.*;

public class BFS {
    private Map<Integer, List<Integer>> graph = new HashMap<>();

    // Add edge
    public void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
    }

    // BFS traversal
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

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

        bfsGraph.addEdge(1, 2);
        bfsGraph.addEdge(1, 3);
        bfsGraph.addEdge(2, 4);
        bfsGraph.addEdge(2, 5);

        System.out.print("BFS traversal starting from node 1: ");
        bfsGraph.bfs(1);
    }
}
