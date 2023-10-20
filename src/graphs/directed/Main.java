package graphs.directed;

public class Main {

    public static void main(String[] args) {

        int V = 5;
        DirectedGraph graph = new DirectedGraph(V);

        // add directed edges
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        graph.printGraph();

    }
}
