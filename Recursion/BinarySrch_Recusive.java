package Recursion;

public class BinarySrch_Recusive {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,8,23,45,67,89,90};
        
        System.out.println(recursive_Bsrch(arr, 0, arr.length, 45));

    }
    private static int recursive_Bsrch(int[] arr, int s, int e, int target){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }

        if(target > arr[mid]){
            return recursive_Bsrch(arr, mid+1, e , target);
        }
        return recursive_Bsrch(arr, s, mid-1, target);
    }
}
