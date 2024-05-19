package LinkedList.LeetCode_Q;

public class _14PalindromeLL {
    private ListNode head;
    public class ListNode{
        private int val ;
        private ListNode next;
        ListNode(int val ){
            this.val = val;
        }
    }

    public boolean checkPalindrome(ListNode head){
        ListNode mid = getmid(head);
        ListNode sechead =  RevList(mid);
        ListNode revhead = sechead;
        while(head != null &&  sechead != null){
            if(head.val != sechead.val){
                break;
            }
            else{
                head = head.next;
                sechead = sechead.next;

            }
        }
        if(head == null || sechead == null){
            return true;
        }
        RevList(revhead);
        return false;
    }
    private ListNode getmid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return  slow;

    }
    public ListNode RevList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        ListNode nxt = head.next;

        while(current != null ){
            current.next = prev;
            prev = current;
            current = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }

        }
        head = prev;
        return head;
    }

    public void AddAtBeg(int val){
        ListNode node = new ListNode(val);
         node.next =  head;
         head = node;
    }
    public void Display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        _14PalindromeLL node = new _14PalindromeLL();
        node.AddAtBeg(1);
        node.AddAtBeg(2);
        node.AddAtBeg(3);
        node.AddAtBeg(2);
        node.AddAtBeg(1);
        node.Display();
        System.out.println( node.checkPalindrome(node.head));
    }

}
