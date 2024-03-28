package LinkedList.LeetCode_Q;
// recursively reverse the Linked List:

public class _11_ReverseLL {
    private Node head;
    private Node tail;
    private int size;

    _11_ReverseLL() {
        this.size = 0;
    }
    private static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }

    }

    private void RecRev(Node cnode) {
        if (cnode == tail) {  // also cnode.next == null
            head = tail;
            return;
        }

        RecRev(cnode.next);
        tail.next = cnode;
        tail = cnode;
        tail.next = null;

    }
}
