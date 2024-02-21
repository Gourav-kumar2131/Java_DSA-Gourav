package Recursion.Rec_Pattern_Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args){
        int[] arr= new int[]{ 3, 4, 7, 6,};
        bubble_sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble_sort(int[] arr, int start, int end){
        if(end == 0){
            return;
        }

        if(start < end ){
           if(arr[start] > arr[start+1]){  // for descending arr[start] < arr[start+1]
               swap(arr, start, start+1);
           }
           bubble_sort(arr, start+1, end);
        }
        else{
            bubble_sort(arr, 0, end-1);
        }
    }
    static void swap(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

}
