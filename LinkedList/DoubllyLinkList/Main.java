package LinkedList.DoubllyLinkList;

public class Main {
    public static void main(String[] args){
        DLL list = new DLL();
//        list.insertAtBeg(12);
//        list.insertAtBeg(77);
//        list.insertAtBeg(44);
        list.insertAtBeg(23);
//        list.insertAtEnd(99);

        list.insertEnd(99);
        list.insertEnd(88);

        list.display();

        list.insert(23, 44);

        list.display();
    }
}
