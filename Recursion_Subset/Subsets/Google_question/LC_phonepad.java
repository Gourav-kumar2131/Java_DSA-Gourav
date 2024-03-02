package Recursion_Subset.Subsets.Google_question;

import java.util.List;
import java.util.ArrayList;


public class LC_phonepad {

//    class Solution {
//        public List<String> letterCombinations(String digits) {
////            return  phonepadAL("", digits);
//             phonepadAL("", digits);
//
//
//        }
         public static void main(String[] args) {
             System.out.println( phonepadAL("","7"));

        }
        static ArrayList<String>  phonepadAL(String p, String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                if(p.isEmpty()){
                    return list;
                }
                list.add(p.strip());
                return list;
            }
            int digit = up.charAt(0) - '0'; // int no=Character.getNumericValue(up.charAt(0));
            ArrayList<String> ans = new ArrayList<>();

            if(digit == 7 ){
                for(int i = (digit-2)*3; i <= (digit-1)*3 ; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(phonepadAL(p+ch, up.substring(1)));

                }
            }
            if(digit == 8){
                for(int i = (digit-2)*3+1; i <= (digit-1)*3 ; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(phonepadAL(p+ch, up.substring(1)));

                }
            }
            if(digit == 9){
                for(int i = (digit-2)*3+1; i <= (digit-1)*3+1 ; i++){
                    char ch = (char)('a' + i);   //int no=Character.getNumericValue(up.charAt(0));
                    ans.addAll(phonepadAL(p+ch, up.substring(1)));

                }
            }
            if(digit < 7){
                for(int i= (digit-2)*3; i< (digit-1)*3; i++){
                    char ch = (char)('a' + i);
                    ans.addAll(phonepadAL(p+ch, up.substring(1)));

                }
            }
            return  ans;

        }
    }
//}
