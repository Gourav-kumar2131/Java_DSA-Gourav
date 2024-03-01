package Recursion_Subset.Subsets.Google_question;

public class Dice_Face_sum {
    public static void main(String[] args) {
        //if dice has face 7,8,9, or anything we can use this method
        dice_face("", 4, 8);

    }
    static void dice_face(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }

        for(int i=1; i<face && i <= target; i++){ // here  6 is the dice face
            dice_face(p+i, target-i, face);
        }
    }
}
