package Binary_Search;

// find the peak element in the mountain Array
public class _8Find_elm_mountain_arr {
    public static void main(String[] args) {
        int[] arr = { 2,4,6,8,10,12,14,16,15,13,11,9,7,5,3,1}; // no duplicate also, there is no target
        int peak = Ascending_bin(arr);

        int ans = order_agnos(arr, 13, peak  );
        System.out.println("index : "+ans + " Element : "+ arr[ans]);


    }

    // explanation :- in this we have to find the peak element , we don't have any target element
    // first we search for descending part , like arr[mid] > arr[mid + 1] , but more descending element could have lie in left part , so end = mid
    // secondly , we search for ascending part , like arr[mid] < arr[mid +] , but more ascending element could have lie in right part, so start = mid +1
    // Stopping criteria is
    private static int Ascending_bin(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if( arr[mid]>arr[mid+1]){
                // we're in decreasing part of the array
                // but may be left side have grater number satisfy this condition
                // this is why end = mid
                end = mid ;
            }
            // arr[mid] < arr[mid+1]
            else {
                start = mid +1;
            }
        }// loop end start == end,
        return  start;  // end  have same value
    }

    private static int order_agnos(int[] arr, int target,  int peak ){
      if(arr[peak] > arr[peak+1]){  // checking whether it is a ascending or descending part
          int start = peak;
          int end = arr.length-1;
          while( start <= end){
              int mid = start + (end - start)/2;
              if(target > arr[mid]){
                  end = mid -1 ;
              }
              else if ( target < arr[mid]){
                  start = mid +1;
              }
              else{
                  return mid;
              }


          }
      }
      else {
          int start = 0;
          int end = peak - 1;
          while (start <= end) {
              int mid = start + (end - start) / 2;
              if (target > arr[mid]) {
                  start = mid + 1;
              } else if (target < arr[mid]) {
                  end = mid - 1;
              } else {
                  return mid;
              }


          }
      }
      return -1;
    }


}
