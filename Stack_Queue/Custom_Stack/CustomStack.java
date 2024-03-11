package Stack_Queue.Custom_Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomStack(){  // this constructor call the another constructor having one int argument.
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){// when we make an obj of Cust Stack an Array of size will dynamically allocate in heap memory
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean push(int item){
        if(isfull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isfull() {
        return ptr == data.length -1 ; // ptr is at last index;
    }

    public int pop() throws StackException{ // this own Exception
        if(isempty()){
            throw new StackException("Stack is empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }
    public boolean isempty(){
        return ptr == -1;
    }

    public int peek() throws Exception{
        if(isempty() ){
            throw new Exception("Stack cannot peek!! Stack is Empty");
        }
        return data[ptr];
    }


}
