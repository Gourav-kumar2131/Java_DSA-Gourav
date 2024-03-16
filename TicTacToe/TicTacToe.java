package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args){
        char[][] board = new char[3][3];
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[row].length; col++){
                board[row][col] = ' ';

            }
        }
        char player = 'X';
        boolean gameOver = false;
        int count = 0;

        Scanner in = new Scanner(System.in);

        while(!gameOver){
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row = in.nextInt();
            int col = in.nextInt();
            System.out.println();


            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board, player);

                if(gameOver){
                    printBoard(board);
                    System.out.println("Hurray !!! Player " + player + " has Won ");
                }
                else{
                    player = (player == 'X' ? 'O' : 'X');

//                    if(player == 'X'){
//                        player = 'O';
//                    }
//                    else{
//                        player = 'X';
//                    }
                }
            }
            else{
                System.out.println("Invalid Move");
                // terminate if board is full.
//                int flag = 0;
//                for(int i=0; i<board.length; i++){
//                    for(int j=0; j<board[i].length; j++){
//                        if(board[i][j] != ' '){
//                            flag++;
//                        }
//                    }
//                }
                if(count == 9) {
                    System.out.println("Shh!! Game Draw");
                    break;
                }
                count = count -1;
            }
            count = count + 1;

        }

    }

    private static boolean haveWon(char[][] board, char player) {
        // for row
        for(int row=0; row<board.length; row++){
            if(board[row][0] == player && board[row][1] == player && board[row][2] == player ){
                return true;
            }
        }
        // for col
        for(int col=0; col<board.length; col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player ){
                return true;
            }
        }
        if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
            return true;
        }
        if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
            return true;
        }
        return  false;


    }

    private static void printBoard(char[][] board){
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[row].length; col++){
                System.out.print( board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
