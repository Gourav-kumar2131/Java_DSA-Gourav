package Binary_Search;

/* FIND THE ROTATION  COUNT IN ROTATED SORTED ARRAY
 Consider an array of distict numbers sorted in increasing order .The array has been rotated
 (Clockwise) k number of times . Given such an array , find the value of k .
 INPUT: ARR[] =  { 15, 18 2, 3, 6, 12}
 OUTPUT: 2
*/

public class Rotation_Count {
    public static void main(String[] args) {

        int[] rotated_arr =  {  2, 3, 6, 12};

        System.out.println("the count of the rotation is : " + count(rotated_arr) );
    }
    private static int count( int[] rotated_arr){
        int pivot = find_pivot(rotated_arr);
        return pivot +1;
    }

    private static int find_pivot(int[] arr){  // pivot for distinct element only
        int start =0;
        int end = arr.length-1;

        while(start <= end ){
            int mid = start +(end - start )/2;

            if(mid < end && arr[mid] > arr[mid+1]){ // when mid is the pivot element
                return mid;
            }
             if (mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
             if (arr[start] > arr[mid]){
                end = mid -1;
            }
            else  {//if( arr[start] < arr[mid]){  // if else not use after 1 iteration loop end and return val -1;
                start = mid +1;
            }
        }
        return -1;
    }
}
