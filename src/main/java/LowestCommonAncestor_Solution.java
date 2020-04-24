/**
 * Binary Search Tree : Lowest Common Ancestor
 * <p>
 * Problem: You are given a pointer to the root of the binary search tree and two values, v1 and v2. You need to return
 * the lowest common ancestor (LCA) of v1 and v2 in the binary search tree.
 */
public class LowestCommonAncestor_Solution {
    public static Nod lca(Nod root, int v1, int v2) {
        // Write your code here.
        if (root.data < v1 && root.data < v2) {
            return lca(root.right, v1, v2);
        }
        if (root.data > v1 && root.data > v2) {
            return lca(root.left, v1, v2);
        }
        return root;
    }

    static Nod findNode(Nod root, int data) {
        if (root.data == data)
            return root;
        if (data < root.data) {
            root = root.left;
        } else {
            root = root.right;
        }
        return findNode(root, data);
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
        int t = 6;
        Nod root = null;
        int[] arr = new int[]{4, 2, 3, 1, 7, 6};

        while (t-- > 0) {
            int data = arr[t];
            root = insert(root, data);
        }
        int v1 = 1;
        int v2 = 7;
        Nod ans = lca(root, v1, v2);
        System.out.println(ans.data);
    }
}

class Nod {
    Nod left;
    Nod right;
    int data;

    Nod(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
