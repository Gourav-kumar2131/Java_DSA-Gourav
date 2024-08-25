package Array_Arraylist.Question;

import java.util.HashMap;

// LC 1. Two sum.
public class TwoSum {

    public int[] twoSumHash(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i= 0; i<nums.length; i++){
            Integer numind = map.get(nums[i]);

            if(numind != null){
                return new int[] {i, numind};
            }
            map.put(target - nums[i], i);  // we store the target - val, index of element .
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }


}
