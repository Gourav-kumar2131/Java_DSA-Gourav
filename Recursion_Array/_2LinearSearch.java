package Recursion_Array;
// we have done the Binary Search with Recursion previously
// this is a Linear Search with Recursion:

public class _2LinearSearch {
    public static void main(String[] args) {
        int[] arr ={ 12,23,34,45};
        System.out.println(findindex(arr, 45, 0));
        System.out.println(findIndEnd(arr, 45, arr.length-1  ));
    }
    // this for starting index
    static int findindex(int [] arr, int target, int ind){
        // start index equal to length of arr means element not found return -1;
        if(ind==arr.length){
            return -1;
        }

        if(arr[ind]==target){
            return ind;
        }
        return findindex(arr,target,ind+1);
    }
    // Recursion is for last index
    static int findIndEnd(int[] arr, int target, int last){
        if(last == -1){
            return -1;
        }
        if(arr[last]== target){
            return last;
        }
        else{
            return findIndEnd(arr,target,last-1);

        }
    }

}
