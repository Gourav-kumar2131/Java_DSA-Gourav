package Recursion;

// Q. Find the sum of the digits of number i.e 4321 = 4+3+2+1= 10.
// Q. Find the multiplication of the digits of number i.e 4321 = 4*3*2*1= 24.

public class _3Digit_factorial {
   public static void main(String[] args){
       System.out.println("Sum of Digit: " + digit_sum(9999));

       System.out.println("Product: of digit: " + digit_mul(4321));
   }
   static int digit_sum(int n){
      if(n==0){      //n/10 <= 0
          return 0;  // return n%10;
      }
       return ((n%10) + digit_sum(n/10));
   }

    static int digit_mul(int n){
        if(n%10 == n){      //n == 0
            return n;  // return 1;
        }
        return ((n%10) * digit_mul(n/10));
    }
}
