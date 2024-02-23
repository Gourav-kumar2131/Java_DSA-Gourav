package Recursion_Array;
import java.util.ArrayList;


public class _4Dup_srch_All {

        public static void main(String[] args){
            int [] arr = {1,24,34,53,24};
            System.out.println( All_Dup(arr, 24, 0));
        }
        private static ArrayList<Integer> All_Dup(int[] arr, int tar, int ind){

            return helper(arr,tar,ind, new ArrayList<>());
        }
        private static ArrayList<Integer> helper(int[] arr, int tar, int ind, ArrayList<Integer> list){
            if(ind == arr.length ){
                return list;
            }

            if(arr[ind]==tar){
                list.add(ind);
            }
            return helper(arr, tar, ind+1, list);




        }

    }

