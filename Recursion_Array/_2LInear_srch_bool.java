package Recursion_Array;
//
public class _2LInear_srch_bool {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,5};
//        System.out.println(lin_srch(arr, 8,0));
        System.out.println(lin_srch2(arr,8,0));
    }
    static boolean lin_srch(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index]==target || lin_srch(arr, target, index+1);
    }
    private static int lin_srch2(int[] arr, int tar, int i){
        if(arr[i]==tar){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return   lin_srch2(arr, tar, i + 1);

    }
}
