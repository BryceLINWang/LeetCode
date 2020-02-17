package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 两数之和 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int other=target-nums[i];
            if(map.containsKey(other)&&map.get(other)!=i){
                return new int[]{i,map.get(other)};
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void main(String[] args) {
    int []nums={2,7,11,15};
    int target=9;

    }
}
