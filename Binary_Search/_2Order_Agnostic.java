package Binary_Search;

public class _2Order_Agnostic {
    public static void main(String[] args) {
        int[] arr = new int[] {99, 88, 77, 66, 55, 44, 33, 22, 11}; //{12,34,45,56, 63,75,78}
        System.out.println(order_agnost(arr,22));
    }
    private static int order_agnost(int[] arr, int target){
        int start=0;
        int end = arr.length-1;
        int mid = 0;

        // check whether the array is sorted in Ascending Order or Descending Order
        boolean isAsc = arr[start] < arr[end];

        while(end >= start){
            //mid = (start+end)/2;  // may Increase the range of the Integer
            mid = start + (end - start )/2;

            if(target == arr[mid] ) {
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start = mid +1;
                }
                else{
                    end = mid -1 ;
                }
            }
            else{
                if(target>arr[mid]){
                    end = mid -1  ;
                }
                else {
                    start = mid +1;
                }
            }
        }
        return -1;
    }

}
