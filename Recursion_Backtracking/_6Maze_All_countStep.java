package Recursion_Backtracking;

import java.util.Arrays;

public class _6Maze_All_countStep {
    public static void main(String[] args){
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        int[][] arr = new int[3][3];

        maze_count("",0,0,maze,1, new int[maze.length][maze[0].length]);
    }
    static void maze_count(String p, int r, int c, boolean[][] maze,int step, int[][] path ){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;  // last step is also a step so we assign it
            for(int[] arr : path){
               System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;

        if(r<maze.length-1){
            maze_count(p+"D",r+1, c, maze, step+1, path);
        }
        if(c<maze[0].length-1 ){
            maze_count(p+"R", r, c+1, maze,step+1,  path);
        }
        if(r>0){
            maze_count(p+"U", r-1, c, maze,step+1,  path);
        }
        if(c>0){
            maze_count(p+"L", r, c-1, maze,step+1,  path);
        }

        maze[r][c]=true;
        path[r][c]=0;
    }
}
