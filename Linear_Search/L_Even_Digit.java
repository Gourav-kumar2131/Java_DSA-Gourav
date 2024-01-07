package Linear_Search;

//Given an array nums of integer , return how many of them contain an even number of digits

public class L_Even_Digit {
    public static void main(String[] args) {
        int [] nums = new int[] {0,-12, -345, 2, 6, 7896, 6789, 777, 65,555,666,777,444};

        System.out.println(even_digit(nums));

    }
    static int even_digit(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++){
            if( digit_count( nums[i] ) % 2 == 0 ){
                count++;
            }
        }
        return count;
    }

//    static int count(int num){
//        if(num<0){
//            num *= -1;
//        }
//        if(num==0){
//            return 1;
//        }
//
//        int count = 0;
//        while(num>0){
//            num = num/10;
//            count ++;
//        }
//        return count;
//    }
    static int digit_count ( int num ){
        if(num<0){
            num *= -1; // negative number will get positive here
        }
        return (int)(Math.log10(num))+1     ;
    }
}
