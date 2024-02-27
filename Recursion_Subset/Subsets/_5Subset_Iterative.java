package Recursion_Subset.Subsets;

import java.util.ArrayList;
import java.util.List;

public class _5Subset_Iterative {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subseq_itr(arr));
    }
    static List<List<Integer>> subseq_itr(int[] arr){
        List<List<Integer>>  outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num=1; num<=arr.length ; num++){
            int size = outer.size();
            for(int i=0; i<size; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;
    }
}
