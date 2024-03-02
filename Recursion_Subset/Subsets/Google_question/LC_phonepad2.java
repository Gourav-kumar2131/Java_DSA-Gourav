package Recursion_Subset.Subsets.Google_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_phonepad2 {
    public static void main(String[] args) {

    }

        public List<String> letterCombinations(String digits) {
            if(digits.length()==0){
                return new ArrayList<String>();
            }
            return permutaion2_0("",digits);
        }

        public ArrayList<String> A = new ArrayList<>(Arrays.asList("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
        public List<String> permutaion2_0(String p,String up) {
            if(up.isEmpty()){
                List<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            List<String> ans =new ArrayList<>();
            int digit=Character.getNumericValue(up.charAt(0));
            for(int i=0; i<A.get(digit).length(); i++){
                char l = A.get(digit).charAt(i);
                ans.addAll(permutaion2_0(p+l,up.substring(1)));
            }
            return ans;
        }

}
