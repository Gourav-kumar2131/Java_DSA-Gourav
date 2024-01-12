package Sorting_Technique;

import java.util.Arrays;

public class Selection_Sort2 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,3,4};
        Selection(arr);
        System.out.println(Arrays.toString(arr) );
    }
    private static void Selection(int[] arr){

        for(int i=0; i < arr.length; i++){

            int minInd = getMinIndex(arr, i, arr.length-1);
            swap(arr, minInd, i);
        }
    }
    private static int getMinIndex(int[] arr, int start, int end){
        int min = start;
        for(int j = start+1; j <= end; j++ ){
            if(arr[j]< arr[min]){
                min = j ;
            }
        }
        return min;
    }

    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
