package graphs.directed;

import java.util.LinkedList;

public class DirectedGraph {

    private int V;
    private LinkedList<Integer>[] adjList;

    public DirectedGraph(int V) {
        this.V = V;
        adjList = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
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
}
