package LinkedList.LeetCode_Q;


public class _9BubblesortLL {
    private ListNode head;
    private ListNode tail;
    private int size ;
    _9BubblesortLL(){
        this.size = 0;
    }
    private static class ListNode{
        int val;
       ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void bubbblesort(){
          bubble(size-1, 0);

    }
    public void bubble(int row, int col){
        if(row==0){
            return;
        }

        if(col<row){
            ListNode first = get(col);
            ListNode sec = get(col+1);

            if(first.val > sec.val){
                if(first == head){
                   head = sec;
                   first.next = sec.next;
                   sec.next = first;

                }
                else if(sec == tail){
                    ListNode prev = get(col-1);
                    prev.next = sec;
                    tail = first;
                    first.next = null;
                    sec.next = first;

                }
                else{
                    ListNode prev = get(col-1);
                    prev.next = sec;
                    first.next = sec.next;
                    sec.next = first;

                }
            }
            bubble(row , col+1);
        }
        else{
            bubble(row-1, 0);
        }
    }
    public  ListNode get(int index){
        ListNode temp = head;

        for(int i=0; i < index; i++){
            temp = temp.next;
        }
        return  temp;

    }
    public void insertBeg(int val){
       ListNode newnode = new ListNode(val);
        newnode.next = head; // here we assign the  value of head (obj) to next ref var of type Node.
        head = newnode;

        if(tail==null){
            tail = head;
        }
        size += 1;
    }
    public void insertEnd(int val){
        if(tail == null){
            insertBeg(val);
            return;
        }
       ListNode newnode = new ListNode(val);
        tail.next = newnode;
        tail=newnode;

        size += 1;
    }
    private void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        _9BubblesortLL ob_node = new _9BubblesortLL();
        ob_node.insertBeg(12);
        ob_node.insertEnd(2);
        ob_node.insertEnd(5);
        ob_node.insertEnd(24);
        ob_node.insertEnd(9);
        ob_node.display();
        ob_node.bubbblesort();
        ob_node.display();


    }
}
