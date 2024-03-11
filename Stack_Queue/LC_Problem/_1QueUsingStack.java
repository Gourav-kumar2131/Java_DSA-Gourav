package Stack_Queue.LC_Problem;
//LC 232. Implement Queue using Stacks.

import java.util.Stack;

// insertion takes O(1) && removal takes O(N) times

public class _1QueUsingStack {
    private Stack<Integer> firststack ;
    private Stack<Integer> helperstack;

    public _1QueUsingStack() {
        this.firststack = new Stack<>();
        this.helperstack = new Stack<>();
    }

    public void push(int item){
        firststack.push(item);
    }

    public int pop() throws Exception{
//      helpertstack.addAll(firststack);  will copy teh element in the same order.

        if(firststack.isEmpty()){
            throw new Exception("Stack is Empty");
        }
        while( !firststack.isEmpty() ){
            helperstack.push(firststack.pop());
        }
        int popped = helperstack.pop();

        while( !helperstack.isEmpty() ){
            firststack.push(helperstack.pop());
        }
        return popped;

    }
    public int peek() throws Exception{
        if(firststack.isEmpty()){
            throw new Exception("Stack is Empty");
        }

        while(!firststack.isEmpty()){
            helperstack.push(firststack.pop());
        }
        int peeked = helperstack.peek();

        while(!helperstack.isEmpty()){
            firststack.push(helperstack.pop());
        }
        return peeked;
    }

    public  boolean isEmpty(){
        return  firststack.isEmpty();
    }


    public static void main(String[] args) throws Exception {
        _1QueUsingStack queue = new _1QueUsingStack();

        queue.push(12);
        queue.push(9);
        queue.push(1);
        queue.push(6);

        System.out.println(queue.pop());

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

    }

}
