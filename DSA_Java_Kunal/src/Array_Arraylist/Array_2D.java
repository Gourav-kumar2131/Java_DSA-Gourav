package Array_Arraylist;

import java.util.Arrays;

public class Array_2D {
    public static void main(String[] args){
//        Declaration of 2D array
        int[][] array = new int[3][]; // column size is not mandatory but row size is mandatory

        int[][] arr2 = {
                {1, 2, 3},
                {3, 4, 5, 9},
                {6, 7 ,8},
        };
        // printing the element of the 2D array
        for(int row=0; row < arr2.length ; row++){
            for (int col=0; col<arr2[row].length; col++){

                System.out.print( arr2[row][col] + " ");
            }
            System.out.println(" ");
        }
        //  2nd Method to print
        for(int[] arr: arr2){
            System.out.println(Arrays.toString(arr));
        }

    }
}
