package LinkedList.LeetCode_Q;

import java.awt.*;

public class _8Sort_LL {
    private ListNode head;
    private static class ListNode{
        int val;
       ListNode next;
        ListNode() { }
        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val,ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = find_mid(head);


        ListNode Left = sortList(head);
        ListNode right = sortList(mid);

        return merge(Left, right);
    }
    public ListNode merge(ListNode h_list1, ListNode h_list2 ){
        ListNode dummyhead = new ListNode(); // we'are not assign the head to any node , so we return the Dhead.next in last.
        ListNode tail = dummyhead;

        while(h_list1 != null && h_list2 != null  ){
            if(h_list1.val < h_list2.val){
                tail.next = h_list1;
                tail = h_list1;
                h_list1 = h_list1.next;

            }
            else{
                tail.next = h_list2;
                tail = h_list2;
                h_list2 = h_list2.next;
            }
        }
         tail.next = (h_list1 != null) ? h_list1 : h_list2 ;  // if h_list1 is not empty, add the head to last tail of dummyhead node .
//        while(h_list1 != null){                             // otherwise, if (h_list1 != null) is false, then add h_list2 to DH node.
//            tail.next = h_list1;
//            tail = h_list1;
//            h_list1 = h_list1.next;
//        }
//        while (h_list2 != null){
//            tail.next = h_list2;
//            tail = h_list2;
//            h_list2 = h_list2.next;
//        }
        return dummyhead.next;
    }

    public ListNode find_mid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null &&  fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;  // when fast reaches to end then slow reaches upto middle as the speed of slow is half of fast pointer

    }
    private void  insert(int val, int index){
        if(index == 0){
            ListNode node = new ListNode(val);
            head = node;
            head.next = null;
            return;
        }
        rec_insert(index, val, head);

    }
    private ListNode rec_insert(int index, int val, ListNode node){  // copy of reference of head node has passed.
        if(index == 0){
          ListNode newnode = new ListNode(val);
            newnode.next = node;
            return newnode;
        }
        node.next =rec_insert(index-1, val, node.next);
        return node;
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
        _8Sort_LL ob_node = new _8Sort_LL();
        ob_node.insert(12, 0);
        ob_node.insert(9, 1);
        ob_node.insert(16, 2);
        ob_node.insert(22, 1);

        ob_node.display();
        ob_node.sortList(ob_node.head);

        ListNode t =  ob_node.find_mid(ob_node.head);
        System.out.println(t.val);
        //        ob_node.sortList(ob_node.head);
//        ob_node.display();
    }

}
