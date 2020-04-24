import java.io.BufferedWriter;
import java.io.IOException;

public class InsertANodeAtASpecificPositionInALinkedList_Solution {

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

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter)
            throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
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

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode headNode = head;
        SinglyLinkedListNode prevNode = null;
        if (head == null) {
            prevNode = new SinglyLinkedListNode(data);
            return prevNode;
        }

        for (int i = 1; i < position; i++) {
            head = head.next;
            System.out.println(head.data);
        }

        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode temp = null;
        temp = head.next; // store next in temp
        head.next = node; // add
        node.next = temp; // join the tail
        return headNode;
    }

    public static void main(String[] args) throws IOException {
        SinglyLinkedList llist = new SinglyLinkedList();

        llist.insertNode(11);
        llist.insertNode(9);
        llist.insertNode(19);
        llist.insertNode(10);
        llist.insertNode(4);
        printSinglyLinkedList(llist.head, " ");

        int data = 20;
        int position = 3;

        SinglyLinkedListNode llist_head = insertNodeAtPosition(llist.head, data, position);
        System.out.println();
        printSinglyLinkedList(llist.head, " ");
    }
}


