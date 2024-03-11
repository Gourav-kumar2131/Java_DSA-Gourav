package Stack_Queue.LC_Problem;
// HackerRank Question.
import java.util.Arrays;

public class _3TwoStack {

     int Twostacks(int x, int[] a, int[] b){
        return twostack(x, a, b, 0, 0)-1;
    }

    private int twostack(int maxsum, int[] a, int[] b, int sum, int count){
//      base condition
        if(sum > maxsum){
            return count;
        }

        if(a.length == 0 || b.length ==0){
            return count;
        }

        int ans1 = twostack(maxsum, Arrays.copyOfRange(a, 1, a.length), b, sum+a[0], count+1);
        int ans2 = twostack(maxsum, a, Arrays.copyOfRange(b, 1, b.length), sum+a[0], count+1);

       return Math.max(ans1, ans2);

    }

    public static void main(String[] args){
         _3TwoStack stack = new _3TwoStack();

         int Ans = stack.Twostacks(10,new int[]{4, 2, 4,6,1},new int[] {6,7,8, 9} );
        System.out.println("Maximum number of can choosen: "+ Ans);
    }

}
