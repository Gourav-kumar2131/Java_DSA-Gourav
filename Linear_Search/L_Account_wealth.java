package Linear_Search;

/* Return the wealth that the richest customer has .
 A customer's wealth is the amount of money they have in all the bank accounts .
  The richest customer is the customer that has the Maximum wealth */
public class L_Account_wealth {
    public static void main(String[] args){
        int[][] accounts = {
                {5,7,-7,20},  // person 1's bank money
                {1,3,4},      // person 2's bank money
                {2,4,5},      // person 3's bank money
                {5,6,7,8},    // person 4's bank money


        };
        System.out.println( max_wealth( accounts ));

    }
    static int  max_wealth( int[][] accounts ){
        int i,j;

        int max =0; // Integer.MIN_VALUE;

        for(i=0; i< accounts.length; i++){
            int sum =0;
           for(j=0; j<accounts[i].length; j++) {
               sum += accounts[i][j];
           }
           if(sum>max){
               max=sum;
           }


        }
        return max;
    }
}
