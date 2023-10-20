package trees;

public class Main {

    public static Node createNode(int data) {

        // step 1: create a new Node
        // step 2: set the data for that Node
        Node node = new Node(data);

        // step 3: take care of the left and right Nodes which initially will be null,
        // because we don't have child nodes when we create the Node
        node.leftChild = null;
        node.rightChild = null;

        // step 4: return the reference to the Node
        return node;
    }

    // sum calculation
    public static int calculateSum(Node node) {
        if(node == null) {
            return 0;
        }
        return node.data + calculateSum(node.leftChild) + calculateSum(node.rightChild);
    }

    // traverse and print algorithms: Depth First Search / Breadth First Search

    // DFS:
    // preorder (data, left, right)
    // inorder (left, data, right)
    // postorder (left, right, data)

    public static void printTreeInPreorderDFS(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        printTreeInPreorderDFS(root.leftChild);
        printTreeInPreorderDFS(root.rightChild);
    }

    public static void printTreeInInorderDFS(Node root) {
        if (root == null) {
            return;
        }

        printTreeInInorderDFS(root.leftChild);
        System.out.print(root.data + " ");
        printTreeInInorderDFS(root.rightChild);
    }

    public static void printTreeInPostorderDFS(Node root) {
        if (root == null) {
            return;
        }

        printTreeInPostorderDFS(root.leftChild);
        printTreeInPostorderDFS(root.rightChild);
        System.out.print(root.data + " ");
    }

    // Binary Search Tree:
    // Each node is greater than every node in its left subtree
    // Each node is less than every node in its right subtree

    // BST Operations: Insert / Find / Delete -> O(log n)

    // Insert: Insert as a leaf, always start at the root

    // Find: always start at the root -> very fast (in a balanced BST with 10mil nodes, it takes only 30 comparisons)

    // Delete: the leaf node / node that has 1 child / node that has 2 children



    public static void main(String[] args) {

        // Level 1
        Node root = new Node(1);

        // Level 2
        root.leftChild = createNode(2);
        root.rightChild = createNode(3);

        // Level 3
        root.leftChild.leftChild = createNode(4);
        root.leftChild.rightChild = createNode(5);
        root.rightChild.leftChild = createNode(6);
        root.rightChild.rightChild = createNode(7);

        // Level 4
        root.leftChild.rightChild.leftChild = createNode(9);
        root.rightChild.rightChild.leftChild = createNode(15);

        System.out.println(calculateSum(root));

        printTreeInPreorderDFS(root);
        System.out.println();
        printTreeInInorderDFS(root);
        System.out.println();
        printTreeInPostorderDFS(root);
    }
}
