
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BT {

        static int index = -1;

        public static Node buildTree(int nodes[]) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;

        }
    }

    public static void preorder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inOrder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void postOrder(Node root) {
        if (root == null) {
            System.out.print("-1 ");
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void levelorder(Node root) {
        if (root == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node currNode = queue.remove();

            if (currNode == null) {
                System.out.println();
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    queue.add(currNode.left);
                }
                if (currNode.right != null) {
                    queue.add(currNode.right);
                }
            }

        }
    }
    // static int c = 0;

    public static int CountNodes(Node root) {
        if (root == null) {
            // System.out.print("-1 ");
            return 0;
        }
        int a = CountNodes(root.left);
        int b = CountNodes(root.right);
        // System.out.print(root.data + " ");
        return a + b + 1;
    }

    public static int SumofNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int a = SumofNodes(root.left);
        int b = SumofNodes(root.right);
        return a + b + root.data;
    }

    public static int heights(Node root) {
        if (root == null) {
            return 0;
        }
        int leftheight = heights(root.left);
        int rightheight = heights(root.left);
        int myheight = Math.max(leftheight, rightheight) + 1;
        return myheight;
    }

    public static int Diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int diam1 = Diameter(root.left);
        int diam2 = Diameter(root.left);
        int diam3 = heights(root.left) + heights(root.right) + 1;
        int diameter = Math.max(diam3, Math.max(diam1, diam2)) + 1;

        // int diameter = Math.max(diam1 + diam2, Math.max(diam1, diam2)) + 1;
        return diameter;
    }

    static class treeinfo {

        int ht;
        int diam;

        public treeinfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
        }

    }

    public static treeinfo diameter2(Node root) {
        if (root == null) {
            return new treeinfo(0, 0);
        }
        treeinfo left = diameter2(root.left);
        treeinfo right = diameter2(root.right);

        int myht = Math.max(left.ht, right.ht) + 1;
        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int mydiam = Math.max(Math.max(diam1, diam2), diam3);
        treeinfo myinfo = new treeinfo(myht, mydiam);
        return myinfo;
    }

    public static void main(String[] args) {
        //preorder Sequence
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BT tree = new BT();
        Node root = tree.buildTree(nodes);
        // preorder(root);
        // inOrder(root);
        // postOrder(root);
        // levelorder(root);
        // System.out.println(CountNodes(root));
        System.out.println(SumofNodes(root));
        System.out.println(heights(root));
        System.out.println(Diameter(root));
        System.out.println(diameter2(root).diam);
        // System.out.println(root.left.left.data);
    }
}
