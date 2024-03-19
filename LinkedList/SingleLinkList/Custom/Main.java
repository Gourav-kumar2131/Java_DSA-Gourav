package LinkedList.SingleLinkList.Custom;

import LinkedList.SingleLinkList.Custom.CustomLL;

public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        // insertion of a node in the empty single Linked List
        list.insertBeg(12);
        list.insertBeg(23);
        list.insertBeg(9);
        list.insertBeg(66);


        list.insertEnd(99);
        list.Display();
//        System.out.println( list.DeleteAnyInd(2));
        System.out.println( "remove node's value " + list.deleteEnd());


        list.Display();

    }
}
