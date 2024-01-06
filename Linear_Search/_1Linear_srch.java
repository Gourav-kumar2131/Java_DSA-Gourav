package Linear_Search;

public class _1Linear_srch {
    public static void main(String[] args) {
        int arr[] = {23,45,54,343,34,4,5,5,};
        int target = 53;
        System.out.println(Linear_search(arr,target));

    }
    static int Linear_search(int[] arr , int target){
        int i;
        if(arr.length==0){
            return -1;
        }

        for( i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

}
