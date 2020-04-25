import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.IntStream;

public class DeleteANodeFromALinkedList_Solution {
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

    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0) {
            return head.next;
        }
        head.next = deleteNode(head.next, position - 1);
        return head;
    }

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new PrintWriter(System.out));

        SinglyLinkedList llist = new SinglyLinkedList();

        int[] input = new int[]{20, 6, 2, 19, 7, 4, 15, 9, 3};
        IntStream.of(input).forEach(System.out::println);
        for (int i = 0; i < input.length; i++) {
            llist.insertNode(input[i]);
        }

        SinglyLinkedListNode llist1 = deleteNode(llist.head, 8);

        printSinglyLinkedList(llist1, " ", bufferedWriter);
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
}
