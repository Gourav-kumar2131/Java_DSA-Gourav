package Recursion.Rec_Pattern_Sorting;

public class up_star {
    public static void main(String[] args) {
        System.out.println("Upper triangle");
//        down_star(5,0);
        upper_star(5,0);
    }
    static void upper_star(int row , int col){
        if(row==0){
            return;
        }
        if(col<row){
            upper_star(row, col+1);
            System.out.print("* ");
        }
        else{
            upper_star(row-1, 0);
            System.out.println();
        }
    } static void down_star(int row , int col){
        if(row==-1){
            return;
        }
        if(col<row){
            System.out.print("* ");
            down_star(row, col+1);
        }
        else{
            System.out.println();
            down_star(row-1, 0);
        }
    }
}
