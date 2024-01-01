package Binary_Search;

import java.util.Arrays;

public class _6First_Last_pos2 {
    public static void main(String[] args){
        int[] arr = new int[] {12, 23, 46, 46, 46, 88, 99};
        int[] ans = new int[2];
        ans[0] = bin_first( arr, 46, true);
        ans[1] = bin_first( arr, 49, false);

        System.out.println( Arrays.toString(ans) );

    }
    private static int bin_first(int[] arr,  int target, boolean first){
        int ans =-1;
        int start =0;
        int end = arr.length - 1;
        while( start <= end ){
            int mid = start + (end - start)/2;

            if( target < arr[mid] ){
                end = mid -1;
            }
            else if( target > arr[mid] ){
                start = mid + 1;
            }
            else {
                ans = mid ;
                if(first){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }


        }
        return ans;
    }
}
