package LinkedList.CircularLinkList;

public class CLL {
    private Node head;
    private Node tail;
    private int size;
    CLL(){
        this.head=null;
        this.tail=null;
        this.size=0;
    }
    public void insertAtBeg(int val){
        Node newnode = new Node(val);
        if(head == null){
            head= newnode;
            tail= newnode;
        }
        newnode.next= head;
        tail.next= newnode;
        tail = newnode;
//        head = newnode;

    }
    public void delete(int value){
        Node temp = head;
        if(head == null){
            return;
        }

        if(temp.val == value){
            head  = head.next;
            tail.next = head;
            return ;
//             tail.next = temp.next;
//             head = tail.next;
        }
        if(tail.val == value){
            while(temp.next != tail){
                temp = temp.next;
            }
            temp.next = tail.next;
            tail = temp;

            return;
        }

        do{
            Node nxtemp = temp.next;
            if(nxtemp.val == value){
                temp.next = nxtemp.next;
            }
            temp=temp.next;
        }while(temp != head);
    }
    // Display of the circular linked List
    public void display(){
        Node temp = head;
        while(temp != tail){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print(tail.val);
        System.out.println();

    }
    public void display2(){
        Node temp = head;
        if(head != null){
            do{
                System.out.println(temp.val + " -> ");
                temp = temp.next; // here temp move one step forward
            }while(temp != head);  // again when temp reaches to head , stop the loop
        }
    }

    private static class Node{
        private int val;
        private Node next; // it is the object type

        Node(int val){
            this.val=val;
        }
        Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }
}
