package Sorting_Technique;

import java.util.Arrays;

public class MergeSort_Inplace {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 8};
           SortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));


    }
    static void SortInplace(int[] arr, int s, int e){
        if(e- s == 1){
            return;
        }
        int mid = (s+e)/2;

        SortInplace(arr, s, mid);
        SortInplace(arr, mid, e);

         mergeInplace(arr, s , mid, e);
    }
    static void mergeInplace(int[] arr, int s, int m, int e){
        int[] mix = new int[e-s];

        int i=s;  // start index for first arr
        int j=m;  // start index for second arr
        int k=0;  // start index for mix arr

        while(i < m && j < e ){ // if any arr first/ sec empty then
            if(arr[i] < arr[j]){  // first[i] > sec[j] gives the decreasing order
                mix[k] = arr[i];
                i++;
            }
            else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may possible array is not finished yet

        while(i < m){
            mix[k] = arr[i];
            k++;
            i++;
        }
        while(j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }
       for(int l=0; l < mix.length; l++){
          arr[s+l] = mix[l];
        }
    }
}