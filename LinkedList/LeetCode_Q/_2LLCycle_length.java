package LinkedList.LeetCode_Q;


public class _2LLCycle_length {
    private ListNode head;
    private ListNode tail;
   private static class ListNode {
       int val;
       ListNode next;
       ListNode(int x) {
          val = x;
          next = null;
       }
  }
  public static int cycle_len_call(_2LLCycle_length CLL){
       return cycle_len(CLL.head);

  }
  public static int cycle_len(ListNode head) {

       if(head == null){  // for optimization, as not enter in the Loop
           return 0;
       }
       if(head.next == null){ // for optimization, as not enter in the Loop
           return 1;
       }

      ListNode hare = head;
      ListNode turtle = head;


      while(hare != null && hare.next != null) {
          hare = hare.next.next;
          turtle = turtle.next;
          if (hare == turtle) { // they check the reference of the object is same or not.
              int length = 0;
              do {
                  turtle = turtle.next;
                  length += 1;
              } while (turtle != hare);
              return length;
          }
      }
      return 0;

  }
  public void InsertAtend(int val){
       ListNode newnode = new ListNode(val);

       if(head == null){
           head = newnode;
           tail = head;
           tail.next = head;
       }

       newnode.next = head;
       tail.next = newnode;
       tail = newnode;

  }


    public static void main(String[] args) {
        _2LLCycle_length node = new _2LLCycle_length();
        node.InsertAtend(12);
        node.InsertAtend(9);
        node.InsertAtend(3);
        node.InsertAtend(17);

        System.out.println(cycle_len_call(node));




    }


}
