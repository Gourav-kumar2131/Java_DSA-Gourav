package Sorting_Technique;

import java.util.Arrays;

public class Cycle_Sort {

    public static void main(String[] args) {
        int arr[] = {2,5,2,1,4};
        Cycle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void Cycle(int[] arr) {
        int i =0;
        while(i<arr.length){
            int c_ind = arr[i]-1;
            if(arr[i] != arr[c_ind] ){
                swap(arr,i,c_ind);
            }
            else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

//    private static void Cycle(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//
//            while (arr[i] != i+1) {
//                int c_ind = arr[i] - 1;
//                swap(arr, i, c_ind);
//            }
//
//        }
//    }

}
