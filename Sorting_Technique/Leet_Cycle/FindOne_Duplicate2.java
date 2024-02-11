package Sorting_Technique.Leet_Cycle;
//https://leetcode.com/problems/find-the-duplicate-number/submissions/1132607184

public class FindOne_Duplicate2 {
    public static void main(String[] args){
        int[] nums = {2, 2, 4,  1};
        int ans = find_Dup2(nums);
        System.out.println(ans);
    }
    private static int find_Dup2(int[] arr){
        int i=0;
        while(i < arr.length){

            if(arr[i] != i+1){  // if elm not equal to index +1 then, swap , but for dup val in else part we return the elm
                int crct_index = arr[i]-1;
                if(arr[i] != arr[crct_index]){
                    swap(arr, i, crct_index);
                }
                else {
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }
    private static void swap(int[] arr, int first, int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

}
