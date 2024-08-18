package Array_Arraylist.Question;

import java.util.Arrays;
import java.util.Collections;

public class Reverse_arr {
    public static void main(String[] args){
        int[] arr = {1,12 ,3,4,5,6};

//        reverse(arr,0,arr.length-1);
//        System.out.println(Arrays.toString(arr));

        // using inbuilt functions:
//        Arrays.sort(arr, 0, 4);
//        System.out.println(Arrays.toString(arr));

//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));



    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr,start, end);
            start++;
            end--;
        }
    }
    private static void swap(int[] arr , int first, int secnd){
        int temp= arr[first];
        arr[first]=arr[secnd];
        arr[secnd]= temp;
    }
}
