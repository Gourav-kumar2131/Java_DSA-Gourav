package Sorting_Technique.Leet_Cycle;
/*
You have a set of integers s, which originally contains all the numbers from 1 to n.
Unfortunately , fue to some error one of the number in s fot duplicated to another number
int he set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice in and the number that is missing ans return them in the form of Array.
INPUT: nums = [1,2,2,4] ; INPUT: nums = [1,1]
OUTPUT: [2,3]          ;OUTPUT: [1,2]

 */

import java.util.Arrays;

public class SetMismatch_Miss_Dup {
    public static void main(String[] args) {
//      int[] nums ={1,1};
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        int[] ans = findSetMis(nums);
      System.out.println(Arrays.toString(ans));
    }
    private static int[] findSetMis(int[] arr){
        int i=0;
        while( i< arr.length){
            int c_ind = arr[i]-1;
            if(arr[i] != arr[c_ind]){
                swap(arr, i, c_ind);

            }
            else{
                i++;
            }
        }
        // missing = index +1;
        // duplicate = element placed at wrong index;

        for(i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                return new int[] {arr[i],arr[i]+1}; // {arr[i], arr[i]+1
            }

        }
        return new int[]{-1,-1};
    }

    private static void swap(int[] arr, int first, int sec) {
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}
