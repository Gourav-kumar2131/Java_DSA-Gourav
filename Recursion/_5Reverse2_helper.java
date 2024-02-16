package Recursion;

public class _5Reverse2_helper {
    public static void main(String[] args){
       int num = 4321;
        System.out.println(rev_num(num));
    }
    static int rev_num(int num){
        int arg = (int) Math.log10(num);
        return helper(num,arg);

    }
    static int  helper(int num, int arg){
         if( arg < 2){
             return num;
         }
         int rem = num%10;
         return (int) (rem* Math.pow(10, arg)  + helper(num/10, arg-1));

    }
}
