package LinkedList.DoubllyLinkList;

public class DLL {
    private Node head;
    // tail not req in DLL
    private int size;
    DLL(){
        this.size=0;
    }

//    Insertion at beginning of the Doubly Linked List
    public void insertAtBeg(int val){
//        Node newnode = new Node(); // can do this but we have constructor for create a obj with val
//        newnode.val=val;
        Node newnode = new Node(val);
        newnode.next = head;
        newnode.prev=null;
        if(head != null){
            head.prev = newnode;
        }

        head=newnode;
        size +=1;
    }
    public void insertAtEnd(int val){
        Node newnode = new Node(val);
        if(head == null){
            insertAtBeg(val);
        }
        Node last = getlast();
        last.next = newnode;
        newnode.next = null;
        newnode.prev = last;
    }
    public Node getlast(){
        Node last = head;
        while (last.next != null){
            last = last.next;

        }
        return last;
    }
    // Insert At End -- Last -- Kunal
    public void insertEnd(int val){
        Node newnode = new Node(val);
        Node last = head;

        if(head == null){
            newnode.prev=null;
            head = newnode;
            return;
        }
        // if head is null  then last.next give null exception. so above check is req.
        while(last.next != null){
            last = last.next;
        }
        last.next = newnode;
        newnode.prev = last;
        newnode.next = null;

    }
    // Insert After a given value
    public void insert(int aft_val, int val  ){
        Node newnode = new Node(val);
        Node after = find(aft_val);
        if(after == null){
            System.out.println("Doex not exist " + aft_val);
            return;
        }

        newnode.next = after.next; // after.next is null , then null will assign to newnode.next
        newnode.prev = after;
        if(after.next != null){
           newnode.next.prev = newnode;
        }
        after.next= newnode;

    }

    public Node find(int aft_val){
        Node node = head;
        while(node != null){
            if(node.val == aft_val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            last=temp;
            temp=temp.next;
        }
        System.out.print(" END");

        System.out.println("\n\nprinting DLL in Reverse");
        while(last != null){
            System.out.print(last.val + " -> ");
            last=last.prev;
        }
        System.out.println("START");
    }


    private static class Node{
       private int val;
       private Node next;
       private Node prev;

       Node(){
           this.val = 0;
           this.next = null;
           this.prev = null;
       }

        Node(int val){
            this.val=val;
        }
        Node(int val, Node next, Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
