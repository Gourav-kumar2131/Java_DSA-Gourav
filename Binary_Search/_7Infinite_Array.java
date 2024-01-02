package Binary_Search;

public class _7Infinite_Array {
    public static void main(String[] args) {
        int[] inf_arr= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24,30,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52,53,43,5,6,7,8,9,6,534,254,65,34,7,45,34,56,53,43,2,9};
        int ans = inf_srch( inf_arr , 47);
        if(ans != -1){
            System.out.println("Index : " + ans + " element : "+ inf_arr[ans]);
        }
        else{
            System.out.println("Index : " + ans);
        }

    }
    private static int inf_srch(int[] arr, int target){
        int start = 0;
        int end = 1;
        while (target >= arr[end]){
            int temp = end +1;
            end = end +  (end- start +1)*2;
            start = temp;
        }
        while (start <= end ){
            int mid = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else{
                return mid ;
            }
        }
        return -1;
    }
}
