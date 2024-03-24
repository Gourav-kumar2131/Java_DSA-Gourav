package LinkedList.LeetCode_Q;

public class RotateKtimes {
    private ListNode head;
    private int size ;
    RotateKtimes(){
        this.size= 0;
    }
    private static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }

    }

    private ListNode rotateKtimes(ListNode head, int k){ // K is the number of Rotation in LL
        if(k<= 0 || head == null || head.next == null){
            return head;
        }
        ListNode tailnode = head ;
        int size = 1;
        while(tailnode.next != null){
            tailnode = tailnode.next;
            size++;
        }
        tailnode.next = head;


        ListNode newend = head;
        for(int i=1; i< size - (k%size) ; i++){  // we K%size , that means Loop will rotate the List upto k%size times only
            newend = newend.next;                // if size = 5 and k=5 then , no rotation
        }

        head = newend.next;

        newend.next = null;
        return head;

    }
    public void insertbeg(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;
        size += 1;

    }
    public void display(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        RotateKtimes ob_node = new RotateKtimes();
        ob_node.insertbeg(5);
        ob_node.insertbeg(4);
        ob_node.insertbeg(3);
        ob_node.insertbeg(2);
        ob_node.insertbeg(1);
        ob_node.display(ob_node.head);
        ListNode Rothead = ob_node.rotateKtimes(ob_node.head, 7);
        ob_node.display(Rothead);

    }
}
