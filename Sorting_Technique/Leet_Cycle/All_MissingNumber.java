package Sorting_Technique.Leet_Cycle;

import java.util.ArrayList;

import java.util.List;

/*
Given an array nums of n integers where nums[i] is in the range [1,n],
return an array of  all integers in the range [1, n] that do not appear in the <<nums>>
INPUT: nums = [4, 3, 2, 7, 8, 2, 3, 1]
Output: [5, 6]
 */
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class All_MissingNumber {
    public static void main(String[] args){
        // here
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println( find_AllMissNum(nums));

    }
    private static List<Integer> find_AllMissNum(int[] arr){
        // here index start from 0, hence correct index = value -1;

        int i=0;
        while(i < arr.length){
            int correct_index = arr[i] -1;
            if(arr[i] != arr[correct_index]){
                swap(arr, i, correct_index);
            }
            else{
                i++;
            }
        }
        List<Integer> miss = new ArrayList<>();

        for( i=0; i<arr.length; i++){
            if(arr[i] != i+1){  // check index i not equal to value of
                miss.add(i+1);
            }
        }
       return  miss;
    }
    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
