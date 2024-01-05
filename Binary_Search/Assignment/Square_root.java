package Binary_Search.Assignment;

public class Square_root {
    public static void main(String[] args) {
        System.out.println(find_sq_root(8));
    }
    private static int find_sq_root(int num){

        if(num ==0|| num<0){
            return 0;
        }
        int start = 1;
        int end = num;  // universal case
        int ans = 0;

        while (start <= end ){
            int mid = start + (end - start)/2;

            if(mid == num/mid){
                return mid;
            }
            else if (mid < num/mid){ // mid * mid will out range for big integer value
                start = mid +1;

            }
            else{
                end = mid -1;
                ans = mid;
            }
        }
        return ans;  // start will give 1 more than start
    }
}
