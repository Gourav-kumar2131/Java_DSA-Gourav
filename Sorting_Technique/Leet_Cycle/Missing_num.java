package Sorting_Technique.Leet_Cycle;
/*
AMAZON QUESTION.
Given an array NUMS containing n distinct numbers in the range [0, n], return the only number
in the range that is missing from the array.
Input>> nums = [3, 0, 1,]
Output>> 2
Explanation: n=1 since there are 2 numbers , so all  numbers are in the range [0,2]. 2 is the missing number in the range since it
does not appear in nums.
 */

//https://leetcode.com/problems/missing-number

public class Missing_num {
    public static void main(String[] args){
        // for N index there will be N+1 element in the array
        int[] arr = {0,1,3};
        int ans = find_Missing_num(arr);
       System.out.println(ans);
    }

    private static int find_Missing_num(int[] arr) {
       int i=0;
        while(i < arr.length ){
            int correct_index = arr[i];
            if( arr[i] < arr.length && arr[i] != arr[correct_index]){
                swap(arr, i, correct_index); //   item which at this index swap with their correct index
            }
            else{
                i++;
            }
        }
        for(i=0; i<arr.length; i++){
            if(arr[i] != i ){
                return i;
            }
        }
        return arr.length;
    }
    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec]= temp;
    }
}
