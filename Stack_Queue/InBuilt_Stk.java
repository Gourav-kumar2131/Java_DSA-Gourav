package Stack_Queue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class InBuilt_Stk {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();

        stack.push(23);
        stack.push(12);
        stack.push(44);
        stack.push(12);
        stack.push(9);

        System.out.println("Popitem " + stack.pop()); // pop will return the removed element.
        System.out.println("Popitem " + stack.pop());
        System.out.println("Popitem " + stack.pop());
        System.out.println("Popitem " + stack.pop());
        System.out.println("Popitem " + stack.pop());

        System.out.println( stack.size()); // return the element count.
        System.out.println(stack.capacity()); // return the length of its internal data array
        System.out.println(stack.contains(12)); // Returns true if this vector contains the specified element
        stack.clone(); //Returns: a clone of this vector
        stack.equals(6); //Returns:  true if the specified Object is equal to this Vector
        System.out.println(( stack.subList( 2,4))); // Returns: a view of the specified range within this List
        stack.search(12);

        stack.clear(); // Removes all  the elements from the Vector

        ArrayList<Integer> list = new ArrayList<>();
        stack.addAll(list);
        stack.add(3);  // Appends the specified element to the end of this Vector
        System.out.println(stack.lastElement());
        stack.addElement(12); // same as Add

        stack.remove(4); //Removes the element at the specified position in this Vector. & Returns: element that was removed
        stack.removeAll(list);
        stack.removeElement(12); // same as remove
        stack.elementAt(12);  // Returns: the component at the specified index
        stack.get(12); // same as element At










    }
}
