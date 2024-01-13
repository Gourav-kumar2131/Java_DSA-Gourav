package Sorting_Technique;

import java.util.Arrays;
// Merge sort using Recursion
public class MergeSort {
    public static void main(String[] args){
        int[] arr = {2,5,3,8,5,9,4,6};
        int[] ans = sort(arr);
        System.out.println("original arr"+Arrays.toString(arr));  // old arr still same
        System.out.println("Sorted arr"+Arrays.toString(ans));  // ans is sorted as we pass the cop

    }
    static int[] sort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] left = sort( Arrays.copyOfRange(arr, 0, mid));  // here we create a new arr named left and pass it
        int[] right = sort( Arrays.copyOfRange(arr, mid, arr.length) ); // here we create a new arr named right and pass it

        return merge(left,right);

    }

    static int[] merge(int[] first, int[] sec){
        int[] mix = new int[first.length + sec.length];

        int i=0;  // start index for first arr
        int j=0;  // start index for second arr
        int k=0;  // start index for mix arr

       while(i < first.length && j < sec.length ){ // if any arr first/ sec empty then
           if(first[i] < sec[j]){  // first[i] > sec[j] gives the decreasing order
               mix[k] = first[i];
               i++;
           }
           else{
               mix[k] = sec[j];
               j++;
           }
           k++;
       }
       // it may possible array is not finished yet

       while(i < first.length){
           mix[k] = first[i];
           k++;
           i++;
       }
       while(j < sec.length){
           mix[k] = sec[j];
           j++;
           k++;
       }
        return mix; // return the sorted arr mix
    }
}
