package Recursion_Subset.Subsets.Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation_ArrayList {
    public static void main(String[] args){
        System.out.println( permutAl("", "abc"));
    }
    static ArrayList<String> permutAl(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String sec = p.substring(i,p.length());  // p.substring(i) will also work as it will take upto last index
            ans.addAll(permutAl(first + ch + sec, up.substring(1)));
        }
        return ans;
    }

}
