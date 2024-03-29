package Stack_Queue.Custom_Stack;

public class DynamicStack extends CustomStack {
    public DynamicStack(){
        super();
    }
    public  DynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item) {
        if(isfull()){
            int[] temp = new int[data.length * 2];

            for(int i=0; i<temp.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}
