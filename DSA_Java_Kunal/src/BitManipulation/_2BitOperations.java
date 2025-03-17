package BitManipulation;

public class _2BitOperations {

    static int getIthbit(int num, int i){
        int mask = (1 << i);
        if((num & mask) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
    static int setIthbit(int num , int i){
        int mask =  1 << i;
        return (num | mask);

    }
    static int flipIthbit(int num , int i){
        int bitmask =  1 << i;
        return num ^ bitmask;
    }
    static int clearIthbit(int num , int i){
        int bitmask =  ~(1 << i);
        return num & bitmask;
    }

    static int updateIthbit(int num , int i, int newbit){
//         if(newbit ==0){
//             return clearIthbit(num , i);
//         }
//         else{
//             return setIthbit(num, i);
//         }
         num = clearIthbit(num, i);
         int bitmask = ( newbit << i);
         return (num | bitmask);
    }

    public static void main(String[] args) {

       System.out.println(getIthbit(10,2));  // 1010 2th bit of 10 is 0.
        System.out.println(setIthbit(10,2)); // set ith bit = 1;
        System.out.println(flipIthbit(10,2)); // flip the ith 0 to 1 & 1 to 0;
        System.out.println(clearIthbit(10,1)); // clear the ith bit of 1.

        System.out.println(updateIthbit(10,2,1));

    }
}
