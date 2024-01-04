package Binary_Search;

// Mountain array is known as Bitonic array , first inc and then dec
// find the peak element in the mountain Array
public class _8Mountain_Arr {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10,12,14,16,15,13,11,9,7,5,3,1}; // no duplicate also, there is no target
        System.out.println(Ascending_bin(arr));

    }

    // explanation :- in this we have to find the peak element , we don't have any target element
    // first we search for descending part , like arr[mid] > arr[mid + 1] , but more descending element could have lie in left part , so end = mid
    // secondly , we search for ascending part , like arr[mid] < arr[mid +] , but more ascending element could have lie in right part, so start = mid +1
    // Stopping criteria is start = end
    private static int Ascending_bin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if( arr[mid]>arr[mid+1]){
                end = mid ;
            }
            // arr[mid] < arr[mid+1]
            else {
                 start = mid +1;
            }
        }
      return  start;
    }

}
