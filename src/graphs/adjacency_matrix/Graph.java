package graphs.adjacency_matrix;

import java.util.ArrayList;

public class Graph {

    /*6*/   ArrayList<Node> nodes;
    int[][] matrix;

    Graph(int size) {
        matrix = new int[size][size]; // that's why the big O complexity will be O(V^2)
        /*7*/     nodes = new ArrayList<>();
    }

    public void addNode(Node node) {
        /*8*/      nodes.add(node);
    }

    public void addEdge(int src, int dst) {   // source will be the row, destination will be the column
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        if (matrix[src][dst] == 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void print() {
        /*12*/  System.out.print("  ");
        /*9*/     for(Node node : nodes) {
            System.out.print(node.data + " ");
        }
        /*10*/    System.out.println();


     /*1*/   for(int i = 0; i < matrix.length; i++) {   // iterate over rows
            /*11*/    System.out.print(nodes.get(i).data + " ");
     /*2*/       for(int j = 0; j < matrix[i].length; j++) {  // iterate over columns
         /*3*/        System.out.print(matrix[i][j] + " ");
            }
            /*4*/     System.out.println();
        }
    }
}
