package LinkedList.LeetCode_Q;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/  --done
public class _3Dup_Sort_LL {
    private ListNode head;
    private ListNode tail;


    private class ListNode {
      int val;
      ListNode next;
      ListNode (){
      }
      ListNode(int val ){
          this.val = val;
      }
      ListNode(int val, ListNode next){
          this.val = val;
          this.next = next;
      }
    }
    public ListNode deleteDuplicates() {
           ListNode node = head;

           if(node == null){
               return  node;
           }
           while(node.next != null){
               if( node.val == node.next.val){
                   node.next = node.next.next;
//                  size--;
               }
               else{
                   node = node.next;
               }
           }
           return head;
    }

    // Insert part for testing purpose
    public void insertBeg(int val){
        ListNode newnode = new ListNode(val);
        newnode.next = head; // here we assign the  value of head (obj) to next ref var of type Node.
        head = newnode;

        if(tail==null){
            tail = head;
        }

    }
    public void Display(){
        ListNode temp = head;
        while( temp != null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public static void main(String[] args) {
        _3Dup_Sort_LL node = new _3Dup_Sort_LL();
        node.insertBeg(4);
        node.insertBeg(4);
        node.insertBeg(2);
        node.insertBeg(1);
        node.insertBeg(1);
        node.Display();
        node.deleteDuplicates();
        node.Display();

    }

}
