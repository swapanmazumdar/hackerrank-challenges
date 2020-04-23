package practice;

/**
 * A BinaryTree has a left node and a right node and a data. Left node is smaller than the right node. The leaft node
 * has neither a left node nor a right node.
 */
class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;

    BinaryTree() {
    }

    BinaryTree(int data) {
        this.data = data;
    }

    void insert(int value) {
        if (value <= data) {
            if (left == null) {
                left = new BinaryTree(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new BinaryTree(value);
            } else {
                right.insert(value);
            }
        }
    }

    boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.traverseInOrder();
        }

    }

    void traversePreOrder() {
        System.out.println(data);
        if (left != null) {
            left.traversePreOrder();
        }
        if (right != null) {
            right.traversePreOrder();
        }
    }

    void traversePostOrder() {
        if (left != null) {
            left.traversePostOrder();
        }

        if (right != null) {
            right.traversePostOrder();
        }
        System.out.println(data);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.insert(2);
        binaryTree.insert(1);
        binaryTree.insert(3);
        binaryTree.insert(5);
        binaryTree.insert(4);
        binaryTree.insert(6);
        binaryTree.traverseInOrder();
        System.out.println();
        binaryTree.traversePreOrder();
        System.out.println();
        binaryTree.traversePostOrder();
        System.out.println();
        System.out.println(binaryTree.contains(3));
        System.out.println(binaryTree.contains(-1));
        System.out.println(binaryTree.contains(10));
    }
}