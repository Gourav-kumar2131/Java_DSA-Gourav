package Recursion_Subset.Subsets.Google_question;

import java.util.ArrayList;

public class Phone_pad_ArrLst {
    public static void main(String[] args) {
        System.out.println(phonepadAL("", "12"));
        System.out.println("the count of the numpad is: "+phonepadAL("", "12").size() );

    }
    static ArrayList<String>  phonepadAL(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        ArrayList<String> ans = new ArrayList<>();

        for(int i= (digit-1)*3; i< digit*3; i++){
            char ch = (char)('a' + i);
            ans.addAll(phonepadAL(p+ch, up.substring(1)));

        }
        return  ans;

    }
}
