import java.util.HashMap;
import java.util.Map;

public class GetTheValueOfTheNodeAtASpecificPositionFromTheTail_Solution {

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

    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        Map<Integer, Integer> map = new HashMap();
        int position = 0;
        while (head != null) {
            map.put(position++, head.data);
            head = head.next;
        }
        return map.get((map.size() - 1) - positionFromTail);
    }


    public static void main(String[] args) {

        SinglyLinkedList llist = new SinglyLinkedList();
        llist.insertNode(1);
        System.out.println(getNode(llist.head, 0));

        llist = new SinglyLinkedList();
        llist.insertNode(3);
        llist.insertNode(2);
        llist.insertNode(1);
        System.out.println(getNode(llist.head, 2));
    }
}
