package Recursion.Rec_Pattern_Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args){
        int[] nums = {9, 7, 4, 6};
        selection(nums, 0, nums.length-1, 0);
        System.out.println(Arrays.toString(nums));
    }
    static void selection(int[] arr, int row, int col, int max_ind){
        if(col==0){
            return;
        }
        if(col > row){
            if(arr[row+1] > arr[max_ind]){
                max_ind = row+1;
            }
            selection(arr, row+1, col, max_ind);
        }
        else{
            swaps(arr,max_ind, col);
            selection(arr,0, col-1, 0);

        }
    }
    static void swaps(int[] arr, int f, int s){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
