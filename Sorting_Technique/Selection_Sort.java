package Sorting_Technique;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        // take partially sorted array
        int[] arr = {5,4,3,2,1};
        Selection(arr);
        System.out.println(Arrays.toString(arr));

    }



    private static void Selection(int[] arr){
        int last = arr.length-1;

        for(int i=0; i < arr.length ; i++){
           // search for the maximum element and swap correct index

            int max = getMaxIndex(arr,0, last-i);
            swap(arr, max , last-i);


        }
    }

    private static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;

        for (int j = 1; j <= end; j++) {
            if(arr[j]>arr[max]){
                max = j;
            }
        }
        return max;
    }
    private static void swap ( int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
