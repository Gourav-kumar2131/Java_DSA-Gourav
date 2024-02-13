package Recursion;

// Q. find the Factorial
// Q. find the sum upto that number
public class _2Factorial {
    public static void main(String[] args){
        System.out.println("Factorial of Nth Number:  " + fact(5));

        System.out.println("Sum of Nth number " + sum(5));
    }
    static int fact(int n){
        if(n==1){ // n==0 || n==1
            return 1;
        }
        return n * fact(n-1);
    }
    static int sum(int n){
        if(n<=1){ // n==0 || n==1
            return 1;
        }
        return n + sum(n-1);
    }
}
