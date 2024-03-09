package Stack_Queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Inbuilt_Que {
    public static void main(String[] args) {
        Queue<Integer> que = new  LinkedList<>();
//        que.add(12);
//        que.add(9);
//        que.add(41);
//        que.add(26);
//
//        System.out.println(que.remove());
//        System.out.println(que.remove());

//        Deque :- In Deque we can remove the element from both the side.

        Deque<Integer> deq = new  LinkedList<>();
        deq.addFirst(4);
        deq.add(6);
        deq.add(9);
        deq.addLast(22);

        System.out.println(deq.pop());
//        System.out.println(deq.remove());
        System.out.println(deq.removeLast());

    }
}
