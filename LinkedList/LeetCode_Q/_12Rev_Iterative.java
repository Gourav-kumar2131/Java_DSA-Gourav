package LinkedList.LeetCode_Q;

public class _12Rev_Iterative {
    private Node head;
    private static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }

    }

    public void Reverse(Node node){
        if(head == null || head.next == null){
            return ;
        }
        Node prev = null;
        Node pres = head;  // present node
        Node nxt = head.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = nxt;
            if(nxt != null){
                nxt = nxt.next;
            }
//            nxt = (nxt != null)?nxt.next : nxt;

        }
        head = prev;
    }
    public void insertbeg(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> " );
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        _12Rev_Iterative ob_node = new _12Rev_Iterative();
        ob_node.insertbeg(12);
        ob_node.insertbeg(13);
        ob_node.insertbeg(14);
        ob_node.insertbeg(15);

        ob_node.display();
        ob_node.Reverse(ob_node.head);
        ob_node.display();


    }

}
