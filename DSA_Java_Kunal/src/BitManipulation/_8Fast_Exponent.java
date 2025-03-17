package BitManipulation;

public class _8Fast_Exponent {
    static int FastExponent(int a , int num){  // a to the power num
        int ans=1;
        while(num > 0){

            if((num & 1)!=0 ){  // // check LSB is O or 1
                ans = ans * a;
            }
            a = a*a;
            num = num>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(FastExponent(5,3));
    }
}
