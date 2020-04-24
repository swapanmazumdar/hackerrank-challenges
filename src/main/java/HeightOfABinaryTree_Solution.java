/**
 * Tree: Height of a Binary Tree
 * Problem: The height of a binary tree is the number of edges between the tree's root and its furthest leaf.
 */
class HeightOfABinaryTree_Solution {
    /**
     * Complete the getHeight or height function in the editor. It must return the height of a binary tree as an integer.
     * <p>
     * getHeight or height has the following parameter(s):
     * <p>
     * root: a reference to the root of a binary tree.
     * Note - The Height of a binary tree with single node is taken as zero.
     */
    public static int height(Nod root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public static Nod insert(Nod root, int data) {
        if (root == null) {
            return new Nod(data);
        } else {
            Nod cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String[] args) {
        int t = 7;
        Nod root = null;
        int[] testData = new int[]{1, 2, 3, 4, 5, 4, 6, 7};
        while (t-- > 0) {
            int data = testData[t];
            root = insert(root, data);
        }
        int height = height(root);
        System.out.println(height);
    }
}

class Node {
    Nod left;
    Nod right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
