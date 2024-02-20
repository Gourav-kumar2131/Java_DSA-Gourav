package Recursion;
/*
 Given an integer num, return the number of steps to reduce it to zero.
 In one step, if num is Even you have to divide it by 2, otherwise you have to subtract by 1 from it.
 Input: 14 Output: 6
 Step 1: 14 even , divide by 2 and obtain 7.
 step 2: 7 odd, sub 1 : obtained 6 .
 Step 3: 6 even , divide 2: obtain 3
 step 4: 3 odd, sub 1 , obtain 2;
 step 5: 2 even, divide 2, obtain 1
 step 6: 1 odd , sub 1, obtain 0

 */
public class Step_count_Leet {
    public static void main(String[] args) {
        System.out.println(step_count(14));
    }
    private static int step_count(int num){
        return helper( num, 0);
    }

    private static int helper(int num , int count){
        if(num==0){
            return count;
        }
        if(num%2 == 0 ){
            return helper(num/2, count+1);
        }
        return helper(num-1, ++count);

    }

}
