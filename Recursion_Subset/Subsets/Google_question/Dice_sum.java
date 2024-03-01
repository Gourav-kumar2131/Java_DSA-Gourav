package Recursion_Subset.Subsets.Google_question;

import java.util.ArrayList;

public class Dice_sum {
    public static void main(String[] args){
        dice_count("", 4);

        System.out.println(dice_AL("", 4));

        System.out.println(dice_AL("", 4).size() + "  combination of sum of digit is possible");



    }
    static void dice_count(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<6 && i <= target; i++){ // here  6 is the dice face
            dice_count(p+i, target-i);
        }
    }
    static ArrayList<String> dice_AL(String p, int target){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();

        for(int i=1; i<6 && i <= target; i++){ // here  6 is the dice face
            ans.addAll(dice_AL(p+i, target-i));
        }
        return ans;
    }



}
