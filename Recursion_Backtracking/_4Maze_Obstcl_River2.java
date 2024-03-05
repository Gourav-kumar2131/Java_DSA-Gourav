package Recursion_Backtracking;

import java.util.ArrayList;

public class _4Maze_Obstcl_River2 {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };
        System.out.println(maze_obs2("",board,0, 0));
    }
    static ArrayList<String> maze_obs2(String path, boolean[][] board, int r, int c){

        if( r == board.length-1 && c == board[0].length-1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }


        ArrayList<String> belowans = new ArrayList<>();
        if(r< board.length-1 && c<board[0].length-1 && board[r+1][c+1] ){

            belowans.addAll(maze_obs2(path+"D", board, r+1, c+1));
        }
        if(r<board.length-1 && board[r+1][c]){
            belowans.addAll(maze_obs2(path+"V", board, r+1, c));
        }
        if(c<board[0].length-1 && board[r][c+1]){
            belowans.addAll( maze_obs2(path+ "H", board, r, c+1));
        }
        return  belowans;
    }
}
