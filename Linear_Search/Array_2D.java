package Linear_Search;

import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args){
        int [][] arr_2d = {

                {12, 4, 5, 6,7},
                {34,65,89,5},
                {-2,-6,-4,-3},
        };
        int target = -3;
        System.out.println("Target Element found at Index : "+ Arrays.toString(lin_serch_2D(arr_2d,target)));

        System.out.println("Maximum number in the 2D_Array: " + max(arr_2d));

        System.out.println("Minimum number in the 2D_Array: " + min(arr_2d));



    }
    private static int[] lin_serch_2D(int[][] mul_arr, int target ){
        int i, j ;
        for( i=0 ; i<mul_arr.length; i++ ){
            for( j=0 ; j<mul_arr[i].length ; j++){
                if(mul_arr[i][j]==target){
                    return new int[]{i,j};
                }

            }

        }

        return new int[]{-1,-1};
    }

    private static int max( int[][] mul_arr ){
        int i, j ;
        int maxm= Integer.MIN_VALUE;

        for( i=0 ; i<mul_arr.length; i++ ){
            for( j=0 ; j<mul_arr[i].length ; j++){

                if(mul_arr[i][j]>maxm){
                   maxm = mul_arr[i][j];
                }

            }
        }

        return maxm;
    }
    private static int min( int[][] mul_arr ){
        int i, j ;
        int minm = Integer.MAX_VALUE;

        for( i=0 ; i<mul_arr.length; i++ ){
            for( j=0 ; j<mul_arr[i].length ; j++){

                if( mul_arr[i][j] < minm ){
                    minm = mul_arr[i][j];
                }

            }
        }
        return minm;
    }
}
