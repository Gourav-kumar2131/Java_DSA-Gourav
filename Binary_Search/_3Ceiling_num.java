package Binary_Search;

public class _3Ceiling_num {
    public static void main(String[] args) {
         int arr[] = new int[]{1, 3, 7, 8, 9};
         int ans = ceiling_srch(arr, 4);
        System.out.println("the ceiling Index is " + ans + " Element in array : "+ arr[ans]);
    }
    public static int ceiling_srch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;
        if(target>arr[end] && target<arr[start]){
            return -1;
        }
        while(start <= end){
           int mid = start + (end - start)/2;

           if(target<arr[mid]){
               end = mid -1;

           }
           else if(target > arr[mid]){
               start = mid + 1;
           }
           else {
               return mid;
           }
        }
        return start;
    }
}
