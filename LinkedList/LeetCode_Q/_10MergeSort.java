package LinkedList.LeetCode_Q;


public class _10MergeSort {
    private ListNode head;
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
     ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode();
        ListNode tail = dummyHead;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev != null ? midPrev.next : null;
        if (midPrev != null) {
            midPrev.next = null;
        }
        return mid;
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
        _10MergeSort ob_node = new _10MergeSort();
        ob_node.insert(12, 0);
        ob_node.insert(9, 1);
        ob_node.insert(16, 2);
        ob_node.insert(22, 3);
        ob_node.insert(2, 4);
        ob_node.display();
        ob_node.sortList(ob_node.head);
        ob_node.display();

    }
}
