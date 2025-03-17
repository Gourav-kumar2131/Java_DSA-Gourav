package BitManipulation;

public class _4Clear_Range {
    // apna
    static int clearinRange(int num, int i, int j){
        int a = ~(0)<< j+1;
        int b = (1 << i)-1;

        int bitmask = a | b;
        return num & bitmask;
    }

    // gourav
    static int clearRangebit(int num , int i, int j){
        int bitmask = ~(0) << j+1;
        int bitmask2 = ~( ~(0) << i);

        int bitmask3 = bitmask | bitmask2;
        return num & bitmask3;
    }

    public static void main(String[] args) {
        System.out.println( clearRangebit(10, 2, 7));
        System.out.println(clearinRange(10,2,7));
    }
}
