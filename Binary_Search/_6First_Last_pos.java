package Binary_Search;
import java.util.Arrays;
/*
Given an array of integers nums sorted in ascending order find the starting and ending position of a given target value.
if a target is not found in the array, return [-1, -1]
you must write the algorithm in O(log n ) time complexity.
INPUT : nums = [5, 7, 7, 8, 8, 10], target = 8
OUTPUT: [3,4]
 */

public class _6First_Last_pos {
    public static void main(String[] args){
        int[] arr = new int[] {12, 23, 46, 46, 46, 88, 99};
        int[] ans = new int[2];
         ans[0] = bin_first( arr, 46);
         ans[1] = bin_sec( arr, 46);

        System.out.println( Arrays.toString(ans) );


    }
    private static int bin_first(int[] arr,  int target){
        int ans =-1;
        int start =0;
        int end = arr.length - 1;
        while( start <= end ){
            int mid = start + (end - start)/2;

            if( target < arr[mid] ){
                end = mid -1;
            }
            else if( target > arr[mid] ){
                start = mid + 1;
            }
            else {
                ans = mid ;
                end = mid -1;
            }


        }
        return ans;
    }
    private static int bin_sec(int[] arr,  int target){
        int ans= -1;
        int start =0;
        int end = arr.length - 1;
        while( start <= end ){
            int mid = start + (end - start)/2;

            if( target < arr[mid] ){
                end = mid -1;
            }
            else if( target > arr[mid] ){
                start = mid + 1;
            }
            else {
                ans = mid ;
                start = mid + 1;
            }


        }
        return ans;
    }
}
