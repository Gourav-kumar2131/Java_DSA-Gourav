package Sorting_Technique.Leet_Cycle;
/*
Given an array of integers nums containing n+1 integers where each integer is in the range [1,n] inclusive
There is only one repeated number in nums return this repeated number.
INPUT: Nums = [1, 3, 4, 2, 2]

OUTOUT: 2

 */
public class FindOne_Duplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        int ans = find_Dup(nums);
        System.out.println(ans);
    }
    private static int find_Dup(int[] arr){
        int i=0;
        while(i < arr.length){
           int crct_index = arr[i]-1;
           if(arr[i] != arr[crct_index]){
               swap(arr, i, crct_index);
           }
           else {
               i++;
           }
        }
        int ans=-1;
        for( i=0; i<arr.length; i++){
            if(arr[i] != i+1){
                ans = arr[i];
            }
        }
        return ans;
    }
    private static void swap(int[] arr, int first, int sec){
       int temp = arr[first];
       arr[first] = arr[sec];
       arr[sec] = temp;
    }
}
