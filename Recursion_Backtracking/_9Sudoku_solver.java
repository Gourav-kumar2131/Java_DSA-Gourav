package Recursion_Backtracking;

public class _9Sudoku_solver {
    public static void main(String[] args){
        int[][] board = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0},
        };
       if(sudoku(board)){
           display(board);
       }
       else{
           System.out.println("Cannot solve");
       }

    }
    static boolean sudoku(int[][] board){
        int n = board.length;
        int row = -1; // -1 just for initialisation of -1
        int col=-1;

//      this is the way to replace the row col from arguments & pass only board.

        // check where is empty place in the board
        boolean emptyleft = true;
        for(int i=0; i< n; i++){
            for(int j=0; j < n; j++){
                if(board[i][j] == 0){
                    row= i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            // if you found an empty place in row then break and start to fill first, no need to check further
            if(!emptyleft){
                break;
            }
        }
        // this is Base condition
        if(emptyleft == true){ // if there is no empty
            return true; // sudoku is solved
        }

        // Backtrack
        for(int number=1; number <= 9; number++){
            if(issafe(board, row, col, number)){
                board[row][col]=number; // this number may be wrong for future box that is empty now
                if(sudoku(board)){
                    // found the answer ,
                    return true;
                }
                // backtrack
                else {
                    board[row][col] = 0;
                }
            }
        }
        // this show that sudoku can't be solved
        return false;

    }
    static boolean issafe(int[][] board, int row, int col, int num){
        // check if the number is already present in the  row
        for(int i=0; i<board.length; i++){
            if(board[row][i]==num){
                return false;
            }
        }
        // check if the number is already present in the column
        for(int[] nums: board){
            if(nums[col]==num){
                return false;
            }

        }
        // check the number in the sub-boxes
        int sqrt = (int)Math.sqrt(board.length);
        int rowstart = row - (row % sqrt);
        int colstart = col - (col % sqrt);

        for(int r=rowstart; r < rowstart+sqrt; r++){
            for(int c=colstart; c < colstart+sqrt; c++){
                if(board[r][c]==num){
                    return false;
                }
            }
        }
        // if none of above condition true, it means number not present, return true.
        return true;
    }

    // Display the element of the box
    static void display(int[][] board){
        for(int[] row : board){
            for(int element : row){
                System.out.print( element + " ");
            }
            System.out.println();
        }
    }
}
