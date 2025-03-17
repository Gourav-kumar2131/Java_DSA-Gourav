package BitManipulation;

public class _3ClearLastBit {
    static int clearnthbit(int num, int i){
        int n = (num << i);
        return  num & n;
    }
    static int clearnthbit2(int num, int i){
        int bitmask = ( ~(0)<< i );
        return num & bitmask;
    }


    public static void main(String[] args) {
        System.out.println(clearnthbit(15, 2));

        //Approach 2
        System.out.println(clearnthbit2(15, 2));
    }
}
