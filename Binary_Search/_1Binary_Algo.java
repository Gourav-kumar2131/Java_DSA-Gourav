package Binary_Search;

// binary search only work for Sorted array:

public class _1Binary_Algo {
    public static void main(String[] args){
        int arr[] = new int[]{444,223,111, 99, 88, 77, 66, 55, 44, 33, 22 };
        System.out.println(binary_des(arr,131));
    }
    // for Ascending order
    private static int binary_srch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int mid=0;
        while(end >= start){
            //mid = (start+end)/2;  // may Increase the range of the integer
            mid = start + (end - start )/2;

           if(target>arr[mid]){
               start = mid +1;
           }
           else if (target<arr[mid]){
               end = mid ;
           }
           if(target == arr[mid]){
               return mid;
           }


        }
        return -1;
    }

    // for Descending Order
    private static int binary_des(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid=0;
        while(end >= start){
            //mid = (start+end)/2;  // may Increase the range of the integer
            mid = start + (end - start )/2;

            if(target>arr[mid]){
                end = mid -1;
            }
            else if (target<arr[mid]){
                start = mid +1 ;
            }
           else{
                return mid;
            }


        }
        return -1;
    }
}
