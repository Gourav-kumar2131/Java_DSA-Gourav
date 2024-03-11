package Stack_Queue.LC_Problem;
//LC 232. Implement Queue using Stack

import java.util.Stack;

// insertion takes O(n) && removal takes O(1) times

public class _2QueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> helper;

    public _2QueUsingStack(){
        this.first = new Stack<>();
        this.helper = new Stack<>();
    }

    public void push(int item) {
        while (!first.isEmpty()){
            helper.push(first.pop());
        }
        first.push(item);

        while(!helper.isEmpty()){
            first.push(helper.pop());
        }
    }
    public int pop() throws Exception{
        return first.pop();
    }

    public int peek(){
        return first.peek();
    }

    public boolean isEmpty(){
        return first.isEmpty();
    }

    public static void main(String[] args) throws Exception{
        _2QueUsingStack queue = new _2QueUsingStack();
        queue.push(12);
        queue.push(8);
        queue.push(4);
        queue.push(91);

        System.out.println( queue.pop());

        System.out.println(queue.peek());

        queue.isEmpty();
    }
}
