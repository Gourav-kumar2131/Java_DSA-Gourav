package Sorting_Technique.Leet_Cycle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Given an integer array nums of length n where all the integers of nums are int he range [1, n]
and each integer appears once or twice , return an array of all the integer that appears twice.
 */
// https://leetcode.com/problems/find-all-duplicates-in-an-array/submissions/1132612754


public class FindAll_Duplicate {
    public static void main(String[] args) {

        int[] nums = {1, 3, 3, 4, 2, 2};
//        List<Integer> ans =  find_AllDup(nums);
//        System.out.println(ans);
        System.out.println(find_AllDup(nums));
    }
    private static List<Integer> find_AllDup(int[] arr) {
        int i=0;
        while( i < arr.length){
            int c_ind = arr[i]-1;
            if(arr[i] != arr[c_ind]){
                swap(arr, i, c_ind);
            }
            else{
                i++;
            }
        }

        List<Integer> AllMissNum = new ArrayList<>();
        for(i=0; i<arr.length; i++){
           if(arr[i] != i+1){
               AllMissNum.add(arr[i]);
           }
        }
        return AllMissNum;
    }

    //This technique is not good as the
//    private static List<Integer> find_AllDup(int[] arr) {
//        int i = 0;
//        List<Integer> All_miss = new ArrayList<>();
//        while (i < arr.length) {
//            if (arr[i] != i + 1) {
//                int c_ind = arr[i] - 1;
//                if (arr[i] != arr[c_ind]) {
//                    swap(arr, i, c_ind);
//                } else {
//                    All_miss.add(arr[i]);
//                }
//            } else {
//                i++;
//            }
//        }
//        return All_miss;
//    }
    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }
}
