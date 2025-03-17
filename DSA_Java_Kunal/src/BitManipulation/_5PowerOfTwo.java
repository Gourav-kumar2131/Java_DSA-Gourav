package BitManipulation;

public class _5PowerOfTwo {
    public static boolean ispowerOfTwo(int num){
        return (num & (num - 1)) == 0;
    }
    public static void main(String[] args){
        System.out.println(ispowerOfTwo(16));
        System.out.println(ispowerOfTwo2(12));
    }

//  Alternate way using Recursion --  // similarly we can check power of 3, 4 or etc.
    public static boolean ispowerOfTwo2(int num){
        if(num <= 0){
            return false;
        }
        if(num == 1){
            return true;
        }
        if(num % 2 != 0){
            return false;
        }

        return ispowerOfTwo2(num / 2);
    }

}
