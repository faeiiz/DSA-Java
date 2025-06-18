
import java.util.ArrayList;

public class BinarySearchTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }
        if (root.data > value) {
            //left subtree
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }
    // List<Integer> l1=new ArrayList<Integer>();

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            // search(root.left);
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    public static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {//root.data==val
            //case 1: 0child
            if (root.left == null && root.right == null) {
                return null;
            }
            //case2 : 1 child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            //case 3: 2 child

            Node is = inorderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, val);

        }
        return root;
    }

    public static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;

    }

    public static void printInRange(Node root, int x, int y) {
        if (root == null) {
            return;
        }
        if (root.data >= x && root.data <= y) {
            printInRange(root.left, x, y);
            System.out.print(root.data + " ");
            printInRange(root.right, x, y);

        } else if (root.data >= y) {
            printInRange(root.left, x, y);
        } else {
            printInRange(root.right, x, y);
        }
    }

    public static void printPath(ArrayList<Integer> path) {
        for (int i = 0; i < path.size(); i++) {
            System.out.print(path.get(i) + "->");
        }
    }

    public static void printRoottoLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);

        //leaf
        if (root.left == null && root.right == null) {
            printPath(path);
            System.out.println();
        } else {
            printRoottoLeaf(root.left, path);
            printRoottoLeaf(root.right, path);
        }
        path.remove(path.size() - 1);
    }

    public static void main(String[] args) {
        //{5,1,3,4,2,7};

        // int values[] = {5, 1, 3, 4, 2, 7};
        int values[] = {8, 5, 3, 6, 10, 11, 14};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        inorder(root);
        // System.out.println(search(root, 7));

        // delete(root, 4);
        // System.out.println();
        // inorder(root);
        // System.out.println();
        // printInRange(root, 3, 10);
        // System.out.println();
        ArrayList<Integer> path = new ArrayList<>();
        printRoottoLeaf(root, path);

    }

}
