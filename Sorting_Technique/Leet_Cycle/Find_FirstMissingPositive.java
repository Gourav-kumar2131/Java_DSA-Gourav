package Sorting_Technique.Leet_Cycle;

import java.util.Arrays;

/*
Given an unsorted array nums , return the smallest missing positive integer.
You must implement an algorithm that runs in O(n) tume and uses constant
extra space.
INPUT: Nums = {-1, 3, 4, 1} Output: [2]
Input: nums = { 1, 3, 4, 2 }
 */
public class Find_FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums ={4, 3, 2, 1,-1};
        int ans = find_FirstPositive(nums);
        System.out.println(ans);
    }
    private static int find_FirstPositive(int[] arr){
        int i=0;
        while( i< arr.length){
            int c_ind = arr[i]-1;
            if(arr[i]>0 &&  arr[i] != arr[c_ind] && arr[i] <= arr.length){
                swap(arr, i, c_ind);
            }
            else{
                i++;
            }
        }
        for(i=0; i<arr.length; i++){
            if( arr[i] != i+1){
                return i+1;
            }

        }
       return -1; // arr.length+1
    }

    private static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
