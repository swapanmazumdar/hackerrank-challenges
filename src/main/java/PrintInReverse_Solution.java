import java.util.Stack;

public class PrintInReverse_Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep) {
        while (node != null) {
            System.out.print(node.data);

            node = node.next;

            if (node != null) {
                System.out.print(sep);
            }
        }
    }

    static void reversePrint(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        int[] input = new int[]{20, 6, 2, 19, 7, 4, 15, 9, 3};
        SinglyLinkedList llist = new SinglyLinkedList();
        for (int i = 0; i < input.length; i++) {
            llist.insertNode(input[i]);
        }
        reversePrint(llist.head);
    }
}
