package Recursion_Array;

public class _6Roatated_srch_Recursivly {
    public static void main(String[] args) {
        int[] rotated = {5,6,7,1,2,3,4};
        System.out.println(recursive(rotated, 0, rotated.length-1, 4));
    }
    private static int recursive(int[] rot, int start, int end, int key){
        int mid = start + (end-start)/2;

        if(rot[mid] == key){
            return mid;
        }
        if(start == end){
            return -1;
        }

        if(rot[start] < rot[mid]){
            if(key < rot[mid]){
                return recursive(rot, start, mid-1, key);
            }
            else{
                return recursive(rot, mid+1, end, key);
            }
        }
        if(key > rot[mid] && key <= rot[end]){
            return recursive(rot, mid+1, end, key);
        }
        else{
            return recursive(rot, start, mid-1, key);
        }

    }
}
