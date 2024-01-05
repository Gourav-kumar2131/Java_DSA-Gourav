package Binary_Search.Assignment;
//https://leetcode.com/problems/guess-number-higher-or-lower/
public class Guess_num {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;

        while(high>= low){
            int mid = low + (high - low )/2;
            if(mid == n){
                return mid;
            }
            else if (mid > n){
                low = mid +1;
            }
            else {
                high = mid -1;
            }
        }
      return -1;
    }
}

