package Array_Arraylist;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Def {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // Q. Store 5 roll number
        int roll1 = 12;
        int roll2 = 13;
        int roll3 = 14;
        int roll5 = 13;

        // using array - DECLARATION & INITIALISATION
//      1.  int[] roll = new int[5];
//      2.  int[] a = new int[] { 1, 2, 3 };

//      3.  int[] rollAll = {12, 23, 34, 45, 55};

//      4.  int ross;
//          ross = new int[5];

        int[] roll = new int[5];
        roll[0]=23;
        roll[1]=13;
        roll[2]=33;
        roll[3]=43;
        roll[4]=53;
        System.out.println(Arrays.toString(roll));

        // Directly - Initialisation and Declaration
        int[] rollAll = {12, 23, 34, 45, 55};
        System.out.println(Arrays.toString(rollAll));
        for(int elm : rollAll){  // for every element elm  in the array print elm
            System.out.print(elm + " ");
        }

        // or separately
         int[] ros ; //-- Declaration of the array # resolve at compile time
         ros =  new int[5]; // initialisation , actually here object is being created here in the Heap memory # at Runtime( execution time)

        // NOTE :
        // In java array's element may or  may not be continuous as Dynamic memory allocation occur for object creation in java and
        // Heap objects are not continuous java architecture says that.

        // String Array
        String[] str = new String[5];

        System.out.println("Enter 5 string name");
        for(int i=0; i<=4 ; i++){
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));




    }
}
