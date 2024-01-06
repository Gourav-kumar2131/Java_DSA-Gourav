package Linear_Search;

public class _2Max_Min_srch {
    public static void main(String[] args){
        double[] arr = {12.32f, 23, 343, 334, 3443, 6, 7, 34, 8, 88, 5, 96,-1};
        System.out.println("Maximum number in the Array: " + max(arr) );
        System.out.println("Minimum number in the array: "+ min(arr));
    }
    static double max(double[] arr ){
        int i;
        if(arr.length==0){
            return -1;
        }
        double max = arr[0];
        for( i=0; i<arr.length; i++){
            if(arr[i]>max){

                max=arr[i];
            }

        }
        return max;
    }
    static double min(double[] arr ){
        int i;
        if(arr.length==0){
            return -1;
        }
        double minm = arr[0];
        for( i=0; i<arr.length; i++){
            if(arr[i]<minm){

                minm=arr[i];
            }

        }
        return minm;
    }
}
