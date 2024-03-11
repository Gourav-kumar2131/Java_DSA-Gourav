package Stack_Queue.Custom_Queue;


public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    CustomQueue(int size) {
        this.data = new int[size];
    }

    int ptr = 0;

    public boolean push(int item) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is Full");
        }
        data[ptr++] = item;  // first data[ptr] = item , then increased the ptr by 1.
//        ptr++;

        return true;
    }

    private boolean isFull() {
        return ptr == data.length;
    }

    public int remove() throws Exception {

        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int removed = data[0];
        for (int i = 1; i < data.length; i++) {
            data[i - 1] = data[i];
        }
        ptr--;

        return removed;
    }

    private boolean isEmpty() {
        return ptr == 0;
    }

    public int front() throws  Exception{
        if(isEmpty()){
            throw new Exception("Empty Queue !!! ");
        }

        return data[0];
    }

    public void Display(){
        for (int elm : data) {
            System.out.print(elm + " <- ");

        }
        System.out.println("END");
    }


}
