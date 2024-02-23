package Recursion_Array;
// return index of target & Dup of target also ,without taking Arraylist as a Parameter of method.

import java.util.ArrayList;

public class _5Duplicate_NoParameter {
    public static void main(String[] args) {
        int [] arr ={ 5,7,7,6};
        ArrayList<Integer> ans = findDup(arr,7,0);
        System.out.println(ans);

        System.out.println(findDuprev(arr,7, arr.length));
    }

    // Using pen verify it
    static ArrayList<Integer> findDup(int[] arr, int target, int ind){
        ArrayList<Integer> list  =  new ArrayList<>();

        if(arr.length == ind){
            return list;
        }
        if(arr[ind] == target ){
            list.add(ind);
        }
//        list.addAll(findDup(arr, target, ind+1));
//        return list;
        ArrayList<Integer> below_ind = findDup(arr,target,ind+1 ); // find dup recursive run and return in last then execute bottom code

        list.addAll( below_ind );

        return list;

    }
    static ArrayList<Integer> findDuprev(int[] arr, int target, int ind){
        ArrayList<Integer> list  =  new ArrayList<>();

        if(ind == -1){
            return list;
        }
        if(arr[ind] == target ){
            list.add(ind);
        }
        ArrayList<Integer> below_ind = findDuprev(arr,target,ind-1 ); // find dup recursive run and return in last then execute bottom code

        list.addAll( below_ind );

        return list;
    }
}

