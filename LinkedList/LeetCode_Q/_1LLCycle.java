package LinkedList.LeetCode_Q;

//141. Linked List Cycle
// 142.  Linked List Cycle -II --not done
public class _1LLCycle {
    private static ListNode  head;
    private static class ListNode{
        int val;
        ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */
    public class Solution {
        public boolean hasCycle(ListNode head) {
            if(head == null || head.next == null){
                return false;
            }
            ListNode fast = head;
            ListNode slow = head;

            while(fast != null && fast.next != null){

                fast = fast.next.next;
                slow = slow.next;
                if(fast == slow){
                    return true;
                }
            }
            return false;


        }
    }

}
