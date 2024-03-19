package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class InBuiltLL {
    public static void main(String[] args) {
        LinkedList<Integer> Link = new LinkedList<>();
        Link.add(23); // append at the end of the list
        Link.add(34);

        Link.remove(); // remove the head;
        Link.push(12);

        Link.offer(12);  // append at last of the list:
        Link.offerFirst(12);
        Link.offerLast(12);

        Link.poll(); // remove the head of LL or return null if list is empty
        Link.pollFirst();
        Link.pollLast();


        System.out.println(Link);
    }
}
