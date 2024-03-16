package TicTacToe;

public class Continueloop {
    public static void main(String[] args) {
        int num = 1;


        while(num != 0){
            num += 1;
            if(num > 3 && num < 7){

                continue;
            }
            if(num == 9){
                break;
            }
            System.out.println(num);
            num += 1;
        }
    }
}
