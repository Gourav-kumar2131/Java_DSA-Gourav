package LinkedList.CircularLinkList;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
         list.insertAtBeg(12);
         list.insertAtBeg(22);
         list.insertAtBeg(32);
         list.insertAtBeg(42);
         list.insertAtBeg(52);
         list.display();
         list.delete(52); // not work for deleting the last index of the circular Linked List.
         list.display();

    }
}
