package Sorting_Technique;
import java.util.Arrays;

// it compare the j and j-1 element in the array

public class Bubble_sort2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void Bubble( int [] arr){
        //
       for(int i=0; i<arr.length; i++){
            boolean swaped = false;
          // after each j loop maxm element will come at end
           for(int j=1; j<arr.length -i; j++){
               // swap if item is smaller than prev item
               if(arr[j] < arr[j-1]){
                   swap(arr, j-1, j);
                   swaped = true;
               }
           }
           // if didn't swap for a particular value of i, it mean arr is already sorted , Stop no further search
           if(!swaped){
               break;
           }
       }
    }
    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }



}
