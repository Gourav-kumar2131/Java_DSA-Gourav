package Sorting_Technique;

import java.util.Arrays;
// QuickSort is unstable Algorithm
// Quicksort work on inplace algorithm
// time complexity is O(log n).
public class QuickSort {
    public static void main(String[] args){
        int[] arr = { 1,4,2,7,3,6};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums, int low, int high ){
        if(low >= high){
            return;
        }
        int strt = low;
        int end = high;
        int mid = strt + (end-strt)/2;
        int pivot = nums[mid];  // we can choose any pivot elm from the array

        while(strt <= end){
            while(nums[strt]< pivot){
                strt++;
            }
            while(nums[end]>pivot){
                end--;
            }
            if(strt <= end){
                int temp = nums[strt];
                nums[strt] = nums[end];
                nums[end] = temp;
                strt++;
                end--;
            }
        }
//        now my pivot at correct index ,now we can sort the two half recursively.
        sort(nums, low, end);
        sort(nums, strt, high);
    }
}
