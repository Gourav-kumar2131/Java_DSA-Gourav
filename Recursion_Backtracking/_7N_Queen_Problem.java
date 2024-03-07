package Recursion_Backtracking;

import java.util.Scanner;

public class _7N_Queen_Problem {
    public static void main(String[] args) {
//        System.out.println("Enter the dimension of Board");
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
        int n=8;
        boolean[][] board = new boolean[n][n]; // in beginning all the index of maze is false. empty means false
        System.out.println( queens(board, 0)); // initially the row start from 0

    }
    static int queens(boolean[][] board, int row){
        if(row == board.length){ // when the Queen place at last row i.e. the length of the board
            display(board);
            return 1;
        }
         int count =0;

        // Placing the Queen and check whether it is safe to place or not (by checking every possible row & col of Queen
        for (int col=0; col < board.length ; col++){
            // place the Queen if it is safe
            if(issafe(board,row, col)){
                board[row][col]= true;
                count += queens(board, row+1);
                // when you come out rec func change it -- Backtracking
                board[row][col]=false;
            }

        }
        return count;
    }

    public static boolean issafe(boolean[][] board, int row, int col) {
        //check for vertical row
        for(int i=0; i < row; i++){

            if(board[i][col]){
                return false;
            }
        }

        // check for left Diagonal move of the queen is safe or not
        int maxLeft = Math.min(row, col);
        for(int i=1; i <= maxLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        // check for Right Diagonal move of the queen is safe or not
        int maxRight = Math.min(row, board.length-1-col);
        for(int i=1; i <= maxRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;

    }

     static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){  // before print check the element is safe at that place or not
                    System.out.print("Q ");
                }
                else{
                    System.out.print("X ");
                }
            }
            System.out.println(" ");
        }
        System.out.println();

    }
}
