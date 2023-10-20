package trees;

public class BinarySearchTree {

    public Node insert(Node root, int data) {
        if (root == null) {
            return createNode(data);
        }
        if (data < root.data) {
            root.leftChild = insert(root.leftChild, data);
        }
        else if (data > root.data) {
            root.rightChild = insert(root.rightChild, data);
        }
        return root;
    }

    public Node createNode(int data) {
        Node node = new Node(data);
        node.leftChild = null;
        node.rightChild = null;
        return node;
    }

    public Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.leftChild = deleteNode(root.leftChild, data);
        }
        else if (data > root.data) {
            root.rightChild = deleteNode(root.rightChild, data);
        }
        else {
            // case 1: node is a leaf or has a single child
            if (root.leftChild == null) {
                return root.rightChild;
            } else if (root.rightChild == null) {
                return root.leftChild;
            }

            // case 2: node has 2 children
            Node successor = findSuccessor(root.rightChild);
            root.data = successor.data;
            root.rightChild = deleteNode(root.rightChild, successor.data);
        }
        return root;
    }

    private Node findSuccessor(Node node) {
        while (node.leftChild != null) {
            node = node.leftChild;
        }
        return node;
    }

    public Node search(Node root, int data) {
        if (root == null || root.data == data) {
            return root;
        }

        if (data < root.data) {
            return search(root.leftChild, data);
        } else {
            return search(root.rightChild, data);
        }
    }
}
