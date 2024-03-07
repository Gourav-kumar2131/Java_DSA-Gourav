package Recursion_Backtracking;



public class _8N_Knights_prob {
    public static void main(String[] args){
        int n = 4;
        boolean[][] board = new boolean[n][n];
        knight_prob(board, 0, 0, n);

    }
    static void knight_prob(boolean[][] board, int row ,int col, int knights){
        if(knights==0){
            display(board);  // uses the display method of 7.N-Queen problem
            System.out.println();
            return;
        }
        if(row == board.length-1 && col == board.length){
            return;
        }

        // if col is last index of the row then check in the new row
        if(col==board.length){
            knight_prob(board, row+1, 0, knights);
            return;
        }


        if(issafe2( board, row, col)){
            board[row][col]=true;
            knight_prob(board, row, col+1, knights-1);
            board[row][col]= false;
        }
        knight_prob(board, row, col+1, knights);
    }

    private static boolean issafe2(boolean[][] board, int row, int col) {
        if(isvalid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;

            }
        }
        if(isvalid(board, row-2, col+1)){
            if(board[row-2][col+1]){ // if this condition true that means this place is cut by the above other knights.
                return false;

            }
        }
        if(isvalid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;

            }
        }
        if(isvalid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        // if these four condition is false, means the place is safe , return true and place the knights.
        return true;

    }

    // do not repeat yourself, Hence created
    static boolean isvalid( boolean[][] board, int row,  int col){
        // it chekc the move is valid on board or the move is out of the board dimension
        if(row >= 0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    static void display(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element : row){
                if(element){  // before print check the element is safe at that place or not
                    System.out.print("K ");
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
