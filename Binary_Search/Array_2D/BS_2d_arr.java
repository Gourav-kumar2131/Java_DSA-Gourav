package Binary_Search.Array_2D;

import java.util.Arrays;

public class BS_2d_arr {
    public static void main(String[] args) {
        int[][] matrix = {    // sorted elm means inc order in row as well as column wise
//                {20, 30, 40, 50},
//                {24, 35, 46, 51},
//                {28, 39, 49, 60},
//                {44, 56, 66, 79},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
        };
        int[] ans = Bin_Srch(matrix, 16);
        System.out.println(Arrays.toString(ans));

    }
    private static int[] Bin_Srch(int[][] matrix, int target){
        int row = 0;
        int col= matrix.length-1;

        while(row < matrix.length && col >= 0){
            if( matrix[row][col] == target){
                return new int[]{row, col};
            }
            else if(matrix[row][col] > target){
                col--;
            }
            else if (matrix[row][col]< target) {
                row++;
            }

        }
      return new int[]{-1, -1};
    }
}
