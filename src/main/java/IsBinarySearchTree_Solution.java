import java.util.Scanner;

class BSTNode {
    int data;
    BSTNode left;
    BSTNode right;

    BSTNode(int data) {
        this.data = data;
    }

    void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BSTNode(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BSTNode(value);
            } else {
                right.insert(value);
            }
        }
    }
}

public class IsBinarySearchTree_Solution {

    boolean checkBST(BSTNode root) {
        if (root.left != null) {
            if(root.data > root.left.data) {
                checkBST(root.left);
            }else {
                return false;
            }
        }
        //System.out.println(root.data);
        if (root.right != null) {
            if(root.data < root.right.data) {
                checkBST(root.right);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        /*IsBinarySearchTree_Solution isBinarySearchTree_solution = new IsBinarySearchTree_Solution();
        BSTNode node = new BSTNode(0);
        node.insert(2);
        node.insert(1);
        node.insert(3);
        node.insert(5);
        node.insert(4);
        node.insert(6);
        System.out.println(isBinarySearchTree_solution.checkBST(node));*/
        /*Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();

        Tree tree = new Tree();
        while(scanner.hasNext()) {
            tree.values.add(scanner.nextInt());
        }
        scanner.close();
        Node root = new Node();
        tree.inOrder(root, height);
        System.out.println((tree.checkBST(root) == true) ? "Yes" : "No");
    */}
}
