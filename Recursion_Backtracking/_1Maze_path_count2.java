package Recursion_Backtracking;

public class _1Maze_path_count2 {
    public static void main(String[] args) {
//        System.out.println( maze_pathcount( 1,1));
        int count =0;
        System.out.println(maze_pathcount( 1,1,count));


    }

    public static int  maze_pathcount( int r, int c){
        if(r==3 || c == 3){
            return 1;

        }

        int count =  maze_pathcount( r+1, c);
        count += maze_pathcount( r, c+1);

        return count ;
    }
    public static int  maze_pathcount( int r, int c, int count){
        if(r==3 || c == 3){
            return 1;
        }

         count = maze_pathcount( r+1, c, count);
         count += maze_pathcount( r, c+1, count);
         return count;

    }
}
