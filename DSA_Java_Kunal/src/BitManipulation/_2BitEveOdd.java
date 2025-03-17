package BitManipulation;

public class _2BitEveOdd {
    public static boolean oddEven(int num){
        if((num & 1) ==0){
            System.out.println("Even");
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(oddEven(11));
    }

}
