package Recursion_Pattern;
import java.util.Arrays;

public class _3Selection_sort_Recursivly {
    public static void main(String[] args) {
        int[] arr = {98, 3, 76, 23,12};
        selection2(arr,arr.length-1, 0, 0 );
        System.out.println(Arrays.toString(arr));

    }

    // Gourav's Approach
    static void selection(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(r > c){
            if(arr[c] > arr[max]){
                max = c;
            }
            selection(arr, r, c+1, max);

        }
        else{
            swap(arr,r,max);
            selection(arr, r-1, 0, 0);
        }
    }
    // this swap is common to both
    static void swap(int[] arr, int first, int next) {
        int temp = arr[first];
        arr[first] = arr[next];
        arr[next]= temp;
    }
    // Kunal's way more efficient
    static void selection2(int[] arr, int r, int c, int max){
        if(r==0){
            return;
        }
        if(r >= c){
           if(arr[c]> arr[max]){
               selection2(arr, r, c+1, c);
           }
           else{
               selection2(arr, r, c+1, max);
           }

        }

        else{
            swap(arr,r,max);
            selection2(arr, r-1, 0, 0);
        }
    }

}
