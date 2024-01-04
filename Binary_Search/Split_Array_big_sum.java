package Binary_Search;
/*
Given an numsay nums which consists of non- negative integers and an integer m, you can split the numsay into m non-negative empty continued subnumsays.
Write an algorithm to minimise the largest sum among these m subnumsays.
INPUT: nums = { 7, 2, 5, 10, 8, }, m=2 OUTPUT: 18
Explanation :- there are four ways to split nums into two subnumsays . The best way is to split it into [7,2,5] and [10,8].
where the largest sum among the two subnumsays is only 18.
 */

public class Split_Array_big_sum {
    public static void main(String[] args) {

    }

    private static int split_numsay(int[] nums, int m){
        int start = 0;
        int end = nums.length-1;

        for(int i=0; i< nums.length; i++){ // simple linear search to find maximum
            start = Math.max(start,nums[i] ); // in the end of the loop this will contain the max item from the array
            end += nums[i];
        }

        // binary Search
        while (start < end ){
            // try fo rthe middle potential ans
            int mid = start + (end - start )/2;

            // calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int piece = 1; // pieces means number of sub-Array  i.e. partitioned of the array
            for(int num : nums){
               if( sum + num > mid) {
                   // you cannot add this in this subarrayy , make new one
                   // say you add this num in new subarray , then sum = num
                   sum = num;
                   piece++;
               }
               else {
                   sum += num;
               }

            }
            if( piece > m){
                start = mid +1;
            }
            else{
                end = mid;
            }
        }
        return end ; // here start == end
    }

}
