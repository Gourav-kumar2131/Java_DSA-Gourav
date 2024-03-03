package Recursion_Backtracking;

import java.util.ArrayList;

// print all the actual Path  to reach the Goal : movement allowed- Right(horizontal), Down(Vertical),
public class _2Maze_path_print {
    public static void main(String[] args){
//        maze_path("", 3,3);
//        System.out.println(maze_path_list("",3,3)); // without parameter
//
        System.out.println(maze_path_AL("",3,3, new ArrayList<>()));
    }
    static void maze_path(String move, int row, int col){
        if(row==1 && col==1){
            System.out.println(move);
            return;
        }

        if(row>1){
            maze_path(move+"D",row-1, col);
        }
        if(col>1){
            maze_path(move+"R",row, col-1);
        }

    }

    static ArrayList<String> maze_path_list(String move, int row, int col){
        if(row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(move);
            return list;
        }
        ArrayList<String> below = new ArrayList<>();

        if(row>1){
            below.addAll( maze_path_list(move+"D",row-1, col));
        }

        if(col>1){
            below.addAll( maze_path_list(move+"R",row, col-1) );
        }

        return below;


    }
    static ArrayList<String> maze_path_AL(String move, int row, int col, ArrayList<String> list){
        if(row==1 && col==1){

            list.add(move);
            return list;
        }
        ArrayList<String> below = new ArrayList<>();

        if(row>1){
            list.addAll( maze_path_list(move+"D",row-1, col));
        }

        if(col>1){
            list.addAll( maze_path_list(move+"R",row, col-1) );
        }
        
        return list;
    }
}
