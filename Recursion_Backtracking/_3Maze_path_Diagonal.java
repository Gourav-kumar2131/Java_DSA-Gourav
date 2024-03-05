package Recursion_Backtracking;

import java.util.ArrayList;

// print all the actual Path  to reach the Goal : movement allowed- Right(horizontal), Down(Vertical) & Diagonally.
public class _3Maze_path_Diagonal {
    public static void main(String[] args){
        maze_diagonal("", 3,3);
        System.out.println(maze_diagonal_list("", 3,3));
    }
    static void maze_diagonal(String move, int r, int c){
        if(r==1 && c==1){
            System.out.println(move);
            return;
        }
        if(r>1 && c>1){
            maze_diagonal(move+" DI", r-1, c-1);
        }
        if(r>1){
            maze_diagonal(move+" DN",r-1, c);
        }
        if(c>1){
            maze_diagonal(move+" R",r, c-1);
        }

    }
     static ArrayList<String> maze_diagonal_list(String move, int r, int c){
         if(r==1 && c==1){
             ArrayList<String> list = new ArrayList<>();
             list.add(move);
             return list;

         }
         ArrayList<String> below = new ArrayList<>();

         if(r>1 && c>1){
             below.addAll(maze_diagonal_list(move+"D", r-1, c-1));
         }
         if(r>1){
             below.addAll(maze_diagonal_list(move+"V",r-1, c));
         }
         if(c>1){
             below.addAll(maze_diagonal_list(move+"H",r, c-1));
         }

         return below;

     }

}
