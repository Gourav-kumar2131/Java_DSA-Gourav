package Stack_Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

//     Deque :- In Deque we can remove the element from both the side.

public class Inbuilt_Deq {
    public static void main(String[] args) {


        Deque<Integer> deq = new ArrayDeque<>(); // ArrayDeque is Class which is resizeable-array
        deq.addFirst(4);
        deq.add(6);
        deq.add(9);
        deq.addLast(22);

        System.out.println(deq.pop());

        System.out.println(deq.remove());
        System.out.println(deq.removeLast());

        System.out.println( deq.peek());  // peek return the first element of the Stack .
        System.out.println(deq.peekFirst());
        System.out.println();

        System.out.println(deq.offer(12));  // similar to removefirst  it remove the head of the queue.

    }
}
