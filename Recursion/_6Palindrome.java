package Recursion;

public class _6Palindrome {
    public static void main(String[] args){
        int num = 3443;
        //check for rev num
        System.out.println(rev(num));
        // check for palindrome
        System.out.println(Palindrome(num));
    }
    static boolean Palindrome(int num){
        return num == rev(num);
    }
    static int rev( int num){
        int arg = (int) Math.log10(num);
        return helper(num, arg);
    }
    private static int helper(int num, int arg){
        if( num == 0 ){
            return num;
        }
        int rem = num%10;
        return (int) (rem * Math.pow(10, arg) + helper(num/10, arg-1));
    }

}
