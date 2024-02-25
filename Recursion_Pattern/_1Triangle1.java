package Recursion_Pattern;

public class _1Triangle1 {
    public static void main(String[] args){
        down_triangle(4,0);
       // up_triangle(4,0);
    }
    // Down Triangle
    static void down_triangle(int r, int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print(" *");
            down_triangle(r,c+1);
        }
        else{
            System.out.println();
            down_triangle(r-1, 0);
        }

    }
    // UP Triangle
    static void up_triangle(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){

            up_triangle(r,c+1);
            System.out.print(" *");
        }
        else{

            up_triangle(r-1, 0);
            System.out.println();
        }

    }
}
