import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Stack;

/**
 * Reverse a linked list
 */
public class ReverseALinkedList_Solution {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));
            node = node.next;
            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    /**
     * Change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning
     * that the initial list is empty.
     */
    static SinglyLinkedListNode reverseRecurssive(SinglyLinkedListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        SinglyLinkedListNode node = reverseRecurssive(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    /**
     * Change the next pointers of the nodes so that their order is reversed. The head pointer given may be null meaning
     * that the initial list is empty.
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.data);
            head = head.next;
        }

        SinglyLinkedListNode newHead = null;
        SinglyLinkedListNode resultHead = null;
        if (stack != null) {
            newHead = new SinglyLinkedListNode(stack.pop());
            resultHead = newHead;
        }
        while (!stack.isEmpty()) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(stack.pop());
            while (newHead.next != null) {
                newHead = newHead.next;
            }
            newHead.next = node;
        }

        return resultHead;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

        int[] input = new int[]{20, 6, 2, 19, 7, 4, 15, 9, 3};
        SinglyLinkedList llist = new SinglyLinkedList();
        for (int i = 0; i < input.length; i++) {
            llist.insertNode(input[i]);
        }

        SinglyLinkedListNode llist1 = reverseRecurssive(llist.head);
        printSinglyLinkedList(llist1, " ", bufferedWriter);

        bufferedWriter.newLine();
    }
}
