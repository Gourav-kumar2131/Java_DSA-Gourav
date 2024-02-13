package Binary_Search.Assignment;

// LC 875. Koko Eating Bananas

import java.util.*;
public class KokoBanana2 {
    private static int minrate(int[] piles , int h){
        int low = 1;  // minm speed of eating
        Arrays.sort(piles);
        int high = piles[piles.length-1];  // maxm speed of eating.

        while(low < high){
            int mid =  low + (high - low)/2;

            int time =  eatspeed(mid, piles, h); // here mid is the speed of eating, and with this eating speed we find the time to eat banana
            if(time <= h){
                high = mid;
            }
            else{
                low = mid +1;
            }
        }
        return low;
    }
    private static int eatspeed(int rate , int[] arr,int h){
        int ans = 0;
        for (int j : arr) {
            ans += Math.ceilDiv(j, rate);
        }
        return  ans;
//        if(ans <= h){
//            return true;
//
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println(minrate(new int[]{1,1,1,999999999}, 10));

    }



}

