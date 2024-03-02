package Recursion_Subset.Subsets.Google_question;

public class Phone_pad {
    public static void main(String[] args) {
        phonepad("", "12");

//        String str = "a2";
//        char digit =   str.charAt(0);
//        System.out.println(digit);
//        int dig = digit - '0' ;
//
//        System.out.println(dig);
    }
    static void phonepad(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // up.chatAt(0) = 1 & - '0' ->> convert it into integer e.g. ( '1' - '0' )

        for(int i= (digit-1)*3; i< digit*3  ; i++){
            char ch = (char)('a' + i);

            phonepad(p+ch, up.substring(1));

        }

    }










//    static void phonepad(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//            return;
//        }
//
//        for(int i=; i<)
//    }
}
