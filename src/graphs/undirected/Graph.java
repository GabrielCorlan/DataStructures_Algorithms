package graphs.undirected;

import java.util.LinkedList;

public class Graph {

    private int V;
    private LinkedList<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    public Graph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
        // for an undirected graph, add the edge in both directions
        adjList[w].add(v);
    }

    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex (Node) " + i + " is connected to: ");
            for (Integer neighbor : adjList[i]) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void depthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[V];
        depthFirstSearchUtil(startVertex, visited);
    }

    private void depthFirstSearchUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (Integer neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                depthFirstSearchUtil(neighbor, visited);
            }
        }
    }

}
