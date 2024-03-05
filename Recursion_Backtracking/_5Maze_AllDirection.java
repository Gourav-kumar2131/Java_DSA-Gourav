package Recursion_Backtracking;
// Given a boolean maze with all path true, also all movement allowed like up down ver horizontal, to reach the goal last index of the maze
// print all the path followed to reach the Goal.
public class _5Maze_AllDirection {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true},
        };
        maze_all("",0,0,maze);

    }
    static void maze_all(String path, int r, int c, boolean[][] maze){
        // base condition
        if(r== maze.length-1 && c==maze[0].length-1){
            System.out.println(path);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        // after visiting a cell mark it as false , so future call will avoid this cell
        maze[r][c]=false;

        // move left
        if(c>0 ){
            maze_all(path+"L", r, c-1, maze);
        }
        // move up
        if(r>0 ){
            maze_all(path+"U", r-1, c,maze);
        }

        // move Down
        if(r < maze.length-1 ){
            maze_all(path+"D",r+1,c,maze );
        }
        // move Right
        if(c< maze[0].length-1 ){
            maze_all(path+"R", r, c+1, maze);
        }
        // after finding one path , some cell mark with false , which not allow to go through the path
        // so, when recursion comes out every will mark as true.

        maze[r][c]=true;

    }
}
