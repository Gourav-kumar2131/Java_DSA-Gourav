package Array_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Def {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         // full covered in OOps array_Stringbuilder

        ArrayList<Integer> list = new ArrayList<Integer>(10); // 10 col is constructor we can create more objects than initial capacity

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();

        for(int i=0; i<3; i++){
            list2.add( new ArrayList<>());
        }
//        for(int i=0; i<3; i++){
//            list2.get(i).add(in.nextInt());
//        }
        System.out.println('a');


    }
}
