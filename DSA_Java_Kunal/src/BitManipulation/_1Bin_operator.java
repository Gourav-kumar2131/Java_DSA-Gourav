package BitManipulation;

public class _1Bin_operator {
    public static void main(String[] args){
        System.out.println(5 & 6);
        System.out.println(5 | 6);
        System.out.println(5 ^ 6);
        System.out.println(~0);
        System.out.println(~5);
        System.out.println(5 << 2);  // left shift


        int a = 12;
        int b = 13;
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println(a +" "+ b);
    }
}
