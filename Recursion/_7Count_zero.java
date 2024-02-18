package Recursion;
// counting the zeroes present in the number

// LEETCODE QUESTION 
public class _7Count_zero {
    public static void main(String[] args){
        int num = 120023;
        System.out.println(count_zero(num));
    }
    static int count_zero(int num){
        return helper( num, 0);
    }
    static int helper(int num , int count){
        if(num== 0){
            return count;
        }
        if(num%10 == 0){
            return helper(num/10, count+1);
        }
        return helper(num/10, count);
    }
}
