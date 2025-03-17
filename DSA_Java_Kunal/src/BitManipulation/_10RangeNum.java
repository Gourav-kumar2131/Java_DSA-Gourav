package BitManipulation;

//201. Bitwise AND of Numbers Range

public class _10RangeNum {
    public static void main(String[] args) {
        int num  = rangeBitwiseAnd(5,7);
        System.out.println(num);
    }
    public static int rangeBitwiseAnd(int left, int right) {
        while(right>left){
            right = right & (right-1);
        }
        return right;
    }
}
