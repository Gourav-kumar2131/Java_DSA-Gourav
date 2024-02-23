package Recursion_Array;
// return index of target & Dup of target also , taking Arraylist as a Parameter of method.

import java.util.ArrayList;

public class _4DuplicateSearch {
    public static void main(String[] args){
        int [] arr ={ 12,4,5,6,7,34,34,6};
        ArrayList<Integer> list = new ArrayList<>();
        // here we pass the Arraylist as a parameter of method
        System.out.println("Index of Duplicate Element: using end index " + findDupInd(arr,34, arr.length-1, list ));

        //ArrayList<Integer> endlist = new ArrayList();
        System.out.println("Index of Duplicate Element: using start index " + findDupIndstart(arr,34, 0, new ArrayList<>()));
    }
    static ArrayList<Integer> findDupInd(int[] arr, int target, int ind , ArrayList<Integer> list){
        // approach through last index
        if(ind == -1){
            return list;
        }
        if(arr[ind]== target){
            list.add(ind);
            //return findDupInd(arr,target, ind-1, list);
        }
        return findDupInd(arr, target, ind-1, list);
    }


    static ArrayList<Integer> findDupIndstart(int[] arr, int target, int ind , ArrayList<Integer> list){
        // approach through Start index
        if(arr.length == ind){
            return list;
        }
        if(arr[ind]== target){
            list.add(ind);
           // return findDupIndstart(arr,target, ind+1, list);
        }
        return findDupIndstart(arr, target, ind+1, list);
    }
}
