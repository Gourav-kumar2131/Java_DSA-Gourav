package Stack_Queue.Custom_Stack;


public class StackMain {
    public static void main(String[] args) throws Exception {
        CustomStack stack = new CustomStack(5);

//        stack.peek();  // throws Exception as Stack is empty initially

        stack.push(12);
        stack.push(9);
        stack.push(2);
        stack.push(8);

        stack.peek();

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
//        System.out.println(stack.pop()); // pop block's exception will throw


        stack.peek();

//      Using Dynamic Stack infinite number of element can be inserted.

        DynamicStack dstk = new DynamicStack();

        dstk.push(12);
        dstk.push(3);
        dstk.push(5);
        dstk.push(9);
        dstk.push(16);
        dstk.push(8);
        dstk.push(38);
        dstk.push(88);




    }
}
