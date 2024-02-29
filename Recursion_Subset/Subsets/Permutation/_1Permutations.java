package Recursion_Subset.Subsets.Permutation;

public class _1Permutations {
    public static void main(String[] args) {
         Str_permutation("", "abc");
    }
    static void Str_permutation(String p, String up){
        int count =0;
        if(up.isEmpty()){
            count += 1;
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        for(int i=0; i<=p.length(); i++){
            String first = p.substring(0,i);
            String sec = p.substring(i, p.length());
            Str_permutation(first+ ch + sec, up.substring(1));
        }
    }
}
