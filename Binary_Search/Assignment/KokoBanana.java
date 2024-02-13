package Binary_Search.Assignment;
// LC 875. Koko Eating Bananas

import java.util.*;
public class KokoBanana {
    private static int minrate(int[] piles , int h){
        int low = 1;  // minm speed of eating
        Arrays.sort(piles);
        int high = piles[piles.length-1];  // maxm speed of eating.

        while(low <= high){
            int mid = low + (high-low)/2;
            int time =  eatspeed(mid, piles); // here mid is the speed of eating, and with this eating speed we find the time to eat banana

            if(time == h){
                return mid;
            }
            else if(time > h){//if time is greater than given hour h then we increase the speed of eating i.e. mid +1, which reduce the time of eating and get closer to h.
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return low;
    }
    private static int eatspeed(int rate , int[] arr){
        int ans = 0;
        for (int j : arr) {
            ans += Math.ceilDiv(j, rate);

        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(minrate(new int[]{3,6,7,11}, 8));

    }



}
