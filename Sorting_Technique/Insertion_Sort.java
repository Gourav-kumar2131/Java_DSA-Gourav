package Sorting_Technique;
import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 2, 3};
        Insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    // for partially sorted array , insertion sort take less number of comparision than Bubble sort, Selection
    private static void Insertion(int[] arr){
        for(int i=0; i < arr.length -1 ; i++){
            //
            for(int j= i+1; j>0; j--){  // sorted done in LHS direction
               if(arr[j] < arr[j-1]){
                   swap(arr, j, j-1);
               }
               // if not swap that means arr of LHS side already sorted
               else{
                   break;
               }
            }
        }
    }
    private static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
