package LinkedList.SingleLinkList.Custom;

public class CustomLL {
// every linked list has Head(ref 1st node) and tail(ref 2nd Node)
    private Node head;
    private Node tail;
    private int size;

    CustomLL(){
        this.size=0;
    }

    private static class Node{  // this Node is a user-defined data Structure/ Datatype.
        private  int val;
        private Node next;

        Node(int val){
            this.val = val;
        }

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }

//    Insertion of a node in the Empty Linked List at  beginning
    public void insertBeg(int val){
        Node newnode = new Node(val);
        newnode.next = head; // here we assign the  value of head (obj) to next ref var of type Node.
        head = newnode;

        if(tail==null){
            tail = head;
        }
        size += 1;
    }

    //    Insertion of a node in the Empty Linked List at the end
    public void insertEnd(int val){
        if(tail == null){
            insertBeg(val);
            return;
        }
        Node newnode = new Node(val);
        tail.next = newnode;
        tail=newnode;

        size += 1;
    }
    //    Insertion of a node in the Empty Linked List at the end
    public void insertInd(int val, int Index){
        if(Index == 0){
            insertBeg(val);
            return;
        }
        if(Index == size){
            insertEnd(val);
            return;
        }
        Node temp = head; // index 0 is itself head
        for (int i=1; i<Index ; i++){
            temp= temp.next;
        }

        Node newnode = new Node(val, temp.next);
        temp.next = newnode;

        size +=1;
    }
//    Deletion of the node at beginning
    public int deleteBeg(){
        int val = head.val;
        head = head.next;
        if(head==null){
            tail=head;
        }
        size--;
        return val;
    }
//        Deletion of the node at end
    public int deleteEnd(){
      if(size <= 1){
         return deleteBeg();
      }
      Node seclast = get(size-1);
      int val =  tail.val;
      tail=seclast;
      seclast.next = null;
      size--;

      return val;
    }

//    Deletion at any index
    public int DeleteAnyInd(int Index){
        if(Index==0){
            deleteBeg();
        }
        if(Index == size-1){
            deleteEnd();
        }
        Node prevnode = get(Index);
        int val = prevnode.next.val;
        prevnode.next = prevnode.next.next;
        size--;
        return val;
    }
    public Node findNode(int value){
        Node node = head;
        while(node != null){
            if(node.val==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }


    public Node get(int index){
        Node node = head;  // it has already assignment as 0 index
        for(int i=1; i< index; i++){
            node = node.next;
        }
        return node;
    }


    // Display the node value of the Linked List
    public void Display(){
        Node temp = head;
        while( temp != null){
            System.out.print(temp.val + " -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

//
//    public static void main(String[] args) {
//
//    }
}
