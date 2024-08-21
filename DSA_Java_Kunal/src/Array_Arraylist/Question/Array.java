package Array_Arraylist.Question;


public class Array {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2};
        int total =  arrsum(arr);
        System.out.println( rangesum(arr, total, 5));
    }


    static int rangesum(int[] arr, int totalsum , int k){
        int i=0;
        int j=0;
        int sum=0;
        boolean flag = true;
        while(totalsum >= k){

            if(flag){
                sum += arr[i];
                totalsum -= arr[i];
                i++;
            }
            else{
                sum += arr[arr.length - 1- j];
                totalsum -= arr[arr.length-1-j];
                j++;
            }
            flag = !flag;
        }
        return sum;
    }
    private static int arrsum(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum;
    }
}
