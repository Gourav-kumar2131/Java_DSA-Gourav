package Recursion;

// Q. print the num 1-5 & 5-1 using recursion.

public class _1print_num {
    public static void main(String[] args) {
       // printnto1(5);
        //revnto1(5);
        printBoth(5);

    }
    static void printnto1(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printnto1(n-1);
        System.out.println("****<< END >>******");
    }

    static void revnto1(int n){
        if(n==0){
            return;
        }
        revnto1(n-1);
        System.out.println(n);
    }

    static void printBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
