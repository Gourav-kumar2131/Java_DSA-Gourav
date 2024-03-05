package Recursion_Backtracking;
// we have maze which have obstacle in the  path in order to reach the goal, if you land on obstacle just return.
// print all the path possible to reach the goal while avoiding obstacle
public class _4Maze_Obstacle_River {
    public static void main(String[] args){
        boolean[][] board= {
                {true,true, true},
                {true,false, true},
                {true,true, true},
        };
        maze_obs("", board, 0,0);
    }
    static void maze_obs( String path, boolean[][] maze, int r, int c){
        if(r== maze.length-1 && c== maze[0].length-1 ){
            System.out.println(path);   // printing the path after reaching the goal
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length-1 && c < maze[0].length-1){
            maze_obs(path+"D",  maze, r+1, c+1);  // Move Diagonally
        }

        if(r < maze.length-1){
            maze_obs(path+"V",  maze, r+1, c); // Move Vertically Right
        }
        if(c < maze[0].length-1) {
            maze_obs(path+"H", maze, r, c+1); // Move Horizontally Down
        }
    }
}
