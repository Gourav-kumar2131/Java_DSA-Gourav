package Linear_Search;

public class _3SearchInRange {
    public static void main(String[] args){
        int[] arr = {12,3,5,6,7,9,64,0,-1};
        System.out.println(range_srch(arr,4,8,12));

    }
    private static int range_srch(int[] arr, int start , int end , int target){
        int i;
        if(arr.length==0){
            return -1;
        }

        for( i=start;  i<=end;  i++){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MAX_VALUE; // may be arr contains -1 , so we return some constant MAX_VALUE
    }
}
