package graphs.undirected;

public class Main {
    public static void main(String[] args) {
        int V = 12;
        Graph graph = new Graph(V);

        // Adding edges (links)
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);
        graph.addEdge(3, 7);
        graph.addEdge(4, 8);
        graph.addEdge(5, 9);
        graph.addEdge(6, 10);
        graph.addEdge(7, 11);

        graph.printGraph();
        System.out.println("-----------------------------");

        // perform DFS starting from node 0
        graph.depthFirstSearch(0);
    }
}
