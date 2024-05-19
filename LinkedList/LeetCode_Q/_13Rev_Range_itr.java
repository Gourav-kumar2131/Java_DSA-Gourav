package LinkedList.LeetCode_Q;

import java.util.List;

public class _13Rev_Range_itr{
    private ListNode head;
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

    }

    public ListNode RevRange(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;


        for (int i = 0; current != null && i < left - 1; i++) {  // if we move current it may get null
            prev = current;
            current = current.next;
        }
        ListNode last = prev;  // we store the prev that left-1 node to connect after reversal
        ListNode newend = current;  // it will the end of the reverse LL , so we store to connect it in last

        ListNode nxt = current.next;

        for (int i = 0; current != null && i < right - left +1 ; i++) {  // no. of Loop run == number of node to reverse
            current.next = prev;  // it may cause null pointer exception
            prev = current;
            current = nxt;
            if (nxt != null) {
                nxt = nxt.next;
            }

        }

        // here we us
        newend.next = current;

        if (last != null) {
            last.next = prev;
        } else {
            head = prev;
        }


        return head;

    }

    public void insertbeg(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        _13Rev_Range_itr ob_node = new _13Rev_Range_itr();
        for (int i = 1; i < 6; i++) {
            ob_node.insertbeg(i);
        }

        ob_node.display();
        ob_node.RevRange(ob_node.head, 2, 4);
        ob_node.display();

    }


}
