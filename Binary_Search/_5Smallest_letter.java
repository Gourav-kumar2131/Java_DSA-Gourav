package Binary_Search;



/*
Given a character lettersay LETTERS that is sorted in non - decreasing order and a character TARGET,
 return the smallest character in the lettersay that is larger the TARGET.
 E.G.  target == 'z' and letters == ['a', 'b'] , ans : 'a'
 e.g. target == 'g and letters == ['c' , 'f', 'j' ]: and = 'j'
*/
public class _5Smallest_letter {
    public static void main(String[] args){
        char[] letters =  new char[]{'a', 'b'};
        char ans = ceiling(letters, 'z');
        System.out.println(ans);

    }
    public static char ceiling(char[] letters, char target){
        int start =0;
        int end = letters.length-1;

        while(start<= end){
            int mid = start + (end - start)/2;

            if(target<letters[mid]){
                end = mid -1;

            }
            else if(target > letters[mid]){
                start = mid + 1;
            }

        }
        return letters[start % letters.length];
    }


}
