package Recursion_Array;
//find element in the array, if dup of target present return the index of  target & duplicate of target also.

import java.util.ArrayList;

public class _3DuplicateSearch2 {
    public static void main(String[] args){
        int[] arr = new int[]{12,234,343,343,343};
        findDupIndex(arr,343,0);
        System.out.println(list);

    }
    static  ArrayList<Integer> list = new ArrayList<>() ;
    static void findDupIndex(int [] arr, int target, int sind ){
        if(sind == arr.length){
            return;
        }
        if(arr[sind ] == target){
            list.add(sind);
            findDupIndex(arr,target,sind+1);
        }
        else{
            findDupIndex(arr, target, sind+1);
        }
    }
//    static void findindex(int [] arr, int target, int ind){
//        // start index equal to length of arr means element not found return -1;
//        if(ind==arr.length){
//            return;
//        }
//
//        if(arr[ind]==target){
//            list.add(ind);
//        }
//        findindex(arr,target,ind+1);
//    }
//}
}
