package Binary_Search;

public class Rotated_bin_srch {
    public static void main(String[] args) {
       int[] rotated_arr = {3, 4, 5, 6, 7, 0, 1, 2};
        int pivot = find_pivot(rotated_arr);
        System.out.println(" Index of the Pivot element is : "+ pivot + " number-"+ rotated_arr[pivot]);

        int ans = search( rotated_arr, 0, pivot);

        System.out.println("Index of seached num is : " + ans);


    }
    private static int search( int[] arr, int target, int pivot ){
        int start = 0;
        int end = arr.length - 1;
        if(pivot == -1){
            return BinarySearch(arr,target, 0, arr.length-1);
        }
       if(arr[pivot] == target){
         return pivot;
       }

       if(arr[start]> target){
           return BinarySearch(arr, target, pivot +1, arr.length-1);
       }
       else {   //if (arr[start] < target){
           return BinarySearch(arr, target, 0, pivot-1   );
       }

    }

    private static int BinarySearch(int[] arr, int target, int start, int end ){

        while( start <= end ){
            int mid = start + (end - start )/2;
            if(target < arr[mid]){
                end = mid -1;
            }
            else if ( target > arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    private static int find_pivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start +(end - start)/2;
            // 4 case that we have thought
            if( mid < end  && arr[mid] > arr[mid + 1]){  // pivot elm is mid himself , mid< end >> assume end is the mid elm then mid+1 means end +1 , gives index out of bound exception
                return mid ;
            }                            // mid > start >> assume mid elm is start then mid-1 means start -1 i.e. index out of bound error .
             if (mid > start &&  arr[mid] <arr[mid-1]){  // mid elm is ( pivot + 1 ) elm
                return (mid -1);
            }
             if ( arr[start] >= arr[mid] ){
               end = mid -1;
            }
//             if ( arr[start] <= arr[mid]){ // all elm smaller than start can be ignored as we seeking for biggest elm i.e. pivot
//                start = mid +1;
//            }
            else{
                start = mid +1;
            }

        }
        return -1;
    }
}
