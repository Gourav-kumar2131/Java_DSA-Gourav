package Pattern;

import java.util.Scanner;

public class Down_Triangular {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of line ");
//        int n = in.nextInt();
        pattern(4);
    }
    private static void pattern(int n){
        // count the number of rows for every number of column
        // here, number of row == number of Column
        for(int i=1; i<=n; i++){
            // for one row and one column we have to print only one star
            for(int j=1; j<=n-i+1 ; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
