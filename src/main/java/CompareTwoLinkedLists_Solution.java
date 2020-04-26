/**
 * Compare two linked lists
 * <p>
 * Problem: You’re given the pointer to the head nodes of two linked lists. Compare the data in the nodes of the linked
 * lists to check if they are equal. The lists are equal only if they have the same number of nodes and corresponding
 * nodes contain the same data. Either head pointer given may be null meaning that the corresponding list is empty.
 */
public class CompareTwoLinkedLists_Solution {

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

    static boolean compareListsRecursive(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) {
            return true;
        }
        if (head1 == null && head2 != null) {
            return false;
        }
        if (head1 != null && head2 == null) {
            return false;
        }
        if (head1.data != head2.data) {
            return false;
        }
        return compareListsRecursive(head1.next, head2.next);
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null && head2 == null) return true;
        while (head1 != null || head2 != null) {
            if (head1 == null || head2 == null) { // it is possible that one of the lists is null then return false
                return false;
            }
            if (head1.data != head2.data) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true; // both the lists are equal in size and contains same data in each node
    }

    public static void main(String[] args) {

        SinglyLinkedList llist1 = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            llist1.insertNode(i);
        }

        SinglyLinkedList llist2 = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            llist2.insertNode(i);
        }

        System.out.println(compareLists(llist1.head, llist2.head) ? 1 : 0);
        System.out.println(compareListsRecursive(llist1.head, llist2.head) ? 1 : 0);

        llist1 = new SinglyLinkedList();
        for (int i = 0; i < 10; i++) {
            llist1.insertNode(i);
        }

        llist2 = new SinglyLinkedList();
        for (int i = 9; i < 15; i++) {
            llist2.insertNode(i);
        }

        System.out.println(compareLists(llist1.head, llist2.head) ? 1 : 0);
        System.out.println(compareListsRecursive(llist1.head, llist2.head) ? 1 : 0);
    }

}
