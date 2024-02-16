package Recursion;

public class _6Palindrome_String {
    public static void main(String[] args) {
        System.out.println(check_palin(121));
    }
    private static boolean check_palin(int n){
        String str  = ""+ n;
        return helper(str ,0, (str.length()-1));

    }
    private static boolean helper(String s, int beg, int end){

        if(s.charAt(beg) != s.charAt(end)){
            return false;
        }
        if(beg==end){
            return true;
        }
        return helper(s,beg+1, end-1);

    }

}
