package Recursion_Backtracking;
// return the number of paths to reach the goal .

public class _1Maze_path_count {
    public static void main(String[] args) {
        System.out.println(path_count(3,3));
    }
    static int  path_count(int row, int col){
        if(row==1 || col==1){
            return 1;
        }
        int left = path_count(row-1, col);
        int right = path_count(row, col-1);

        return left+right;
    }
}
