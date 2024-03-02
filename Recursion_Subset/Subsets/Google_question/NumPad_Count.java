package Recursion_Subset.Subsets.Google_question;

public class NumPad_Count {
    public static void main(String[] args) {
        System.out.println( phonepad("", "12"));
    }
    static int phonepad(String p , String up){
        if(up.isEmpty()){
            return 1;
        }
        int digit = up.charAt(0) - '0'; // up.chatAt(0) = 1 & - '0' ->> convert it into integer e.g. ( '1' - '0' )
        int count =0;
        for(int i= (digit-1)*3; i< digit*3  ; i++){
            char ch = (char)('a' + i);

            count += phonepad(p+ch, up.substring(1));

        }
        return count;

    }
}
