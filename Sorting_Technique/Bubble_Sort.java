package Sorting_Technique;

import java.util.Arrays;

// it compare the j and j+1 element

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] = { 5,4,3,2,1};
        Bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void Bubble(int [] arr){
        boolean swap;

        // for each pass , max item will come at last position
        for(int i=0; i < arr.length; i++){
            swap = false;

            // compare j and j+1 only upto N-2  , to avoid index out bound as j+1 will lead IOB.
            for(int j=0; j < arr.length -i -1 ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                    swap = true;
                }
            }
            // if swap not occur for a particular value of i ,it mean arr is already sorted and stop
//            if(!swap){ // (swap==false)
//                break;
//            }
        }
    }
}
