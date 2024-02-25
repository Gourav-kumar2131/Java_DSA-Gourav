package Recursion_Pattern;

import java.util.Arrays;

public class _2Bubble_sort_recursive {
    public static void main(String[] args) {
        int[] arr = {2, 3, 67, 34, 12};
        bubble(arr,arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int r, int c){
        if(r==0){
            return;
        }
        if(c < r){
             if(arr[c]>arr[c+1]){
                 swap(arr,c,c+1);
             }
            bubble(arr, r, c+1);
        }
        else{

            bubble(arr, r-1, 0);
        }
    }

    static void swap(int[] arr, int c, int next) {
        int temp = arr[c];
        arr[c] = arr[next];
        arr[next]= temp;
    }
}
