package BitManipulation;

public class _7CountSetBit {
    private static int countsetBit(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
            }
            num = num >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countsetBit(1));
    }
}
