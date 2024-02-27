package Recursion_Subset.Subsets;
import java.util.ArrayList;

public class _4Subset_ArrList {
    public static void main(String[] main){
        // Not work with Duplicate value
        System.out.println(subseq_ret("", "abc"));

    }
    static ArrayList<String> subseq_ret(String processed, String unprocessed ){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        char ch = unprocessed.charAt(0);

        ArrayList<String> left =   subseq_ret(processed + ch, unprocessed.substring(1) );
        ArrayList<String> right =  subseq_ret(processed, unprocessed.substring(1));
        // we know , first left will execute and until unprocessed is empty then it return "abc" store in left , for last
        // unprocessed str , c discard and return "ab" which is store in right ,
        // then, all the elements of right store in left arraylist,
        // and return the left list to last called function.


        left.addAll(right);
        return left;
    }
}
