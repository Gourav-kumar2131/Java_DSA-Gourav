package Recursion_Array;
// find whether a array is sorted or not
public class _1Check_Sorted {
    public static void main(String[] args){
        int[] arr = {1,2,4,5,8,9};
        System.out.println(Sorted(arr,0));

    }
    private static boolean Sorted(int[] arr, int index){
          if(arr[index] == arr.length-1){
              return true;
          }
           return  arr[index] < arr[index+1] && Sorted(arr,index+1); // from either if one is false then whole statement is false

    }
}
