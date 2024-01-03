package Binary_Search;

public class Rotated_duplicate {
    public static void main(String[] args){
        int[] dup_rotated = {2,2,3, 9,2,2,2,9,12};
        int ans = find_pivot_with_dup(dup_rotated);
        System.out.println(ans);

    }
    private static int find_pivot_with_dup(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start +(end - start)/2;
            // 4 case that we have thought
            if( mid < end  && arr[mid] > arr[mid + 1]){  // pivot elm is mid himself , mid< end >> assume end is the mid elm then mid+1 means end +1 , gives index out of bound exception
                return mid ;
            }                            // mid > start >> assume mid elm is start then mid-1 means start -1 i.e. index out of bound error .
            if (mid > start &&  arr[mid]<arr[mid-1]){  // mid elm is ( pivot + 1 ) elm
                return (mid -1);
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                // if start and end are same then ignore it , but check whether either start or end is a pivot element or not
                if(arr[start] > arr[start +1]){
                    return start;
                }
                start++;

                if(arr[end] < arr[end-1]){
                    return end-1;
                }
                end--;
            }
            // left part is sorted then we should check for right side only
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid]< arr[end]){
                start = mid +1;

            }
            else {
                end = mid -1;
            }

        }
        return -1;
    }
}
