package Recursion_Subset.Subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _6Subseq_Itr_Dup {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        System.out.println(subseq_Dup(arr));
    }
    static List<List<Integer>>  subseq_Dup(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>>  outer = new ArrayList<>();
        int start =0;
        int end =0;
        outer.add(new ArrayList<>());
        for(int num=0; num < arr.length ; num++){
            start =0;
            if(num > 0 && arr[num] == arr[num-1]){
                start = end +1;
            }
            end = outer.size()-1;
            int size = outer.size();
            for(int i= start; i<size; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[num]); // adding of the element of array here
                outer.add(internal);
            }
        }
        return outer;

    }
}
