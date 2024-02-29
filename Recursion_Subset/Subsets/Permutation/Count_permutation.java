package Recursion_Subset.Subsets.Permutation;

public class Count_permutation {
    public static void main(String[] args){

//       int ans = permutation_count("", "abc");
//       System.out.println(ans);




    }
    static int permutation_count(String p, String up){
        if(up.isEmpty()){
            return 1;  // count 1 return as we get our first subset. and keep adding the number of count for total number.
        }
        char ch = up.charAt(0);
        
        int count =0;
        for(int i=0; i <= p.length(); i++){
            String f = p.substring(0,i);
            String sec = p.substring(i,p.length());

            count += permutation_count(f+ch+sec, up.substring(1));
        }
        return count;
    }
}
