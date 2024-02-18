package Recursion;

public class FibonacciNum {
    public static void main(String[] args){
        // Return the nth fibonacci number
        System.out.println( fiboformula(5));
    }
    private static int fiboformula(int n){
        return (int)( Math.pow((1+Math.sqrt(5))/2,n) -  Math.pow((1-Math.sqrt(5))/2,n));
    }
    private static int fibo(int n){ // return the nth fibonacci number
        int num=0;
        if( n < 2){ // its return the val what its have e.g for 1 ,  1 return 
            return n;
        }

        return  fibo(n-1)+fibo(n-2);
    }
}
