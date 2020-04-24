import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Insert a Node at the Tail of a Linked List
 */
public class InsertANodeAtTheTailOfALinkedList_Solution {

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

        public SinglyLinkedList() {
            this.head = null;
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
     * You are given the pointer to the head node of a linked list and an integer to add to the list.
     * Create a new node with the given integer. Insert this node at the tail of the linked list and return the head
     * node of the linked list formed after inserting this new node. The given head pointer may be null, meaning that the
     * initial list is empty.
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newHead = head;
        if (newHead == null) {
            newHead = new SinglyLinkedListNode(data);
            return newHead;
        }
        while (newHead.next != null) {
            newHead = newHead.next;
        }
        newHead.next = new SinglyLinkedListNode(data);
        return head;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));
        SinglyLinkedList llist = new SinglyLinkedList();

        for (int i = 0; i < 10; i++) {
            SinglyLinkedListNode llist_head = insertNodeAtTail(llist.head, i);
            llist.head = llist_head;
        }
        printSinglyLinkedList(llist.head, "\n", bufferedWriter);

        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
