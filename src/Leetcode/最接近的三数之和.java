package Leetcode;

import java.util.Arrays;

public class 最接近的三数之和 {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans=nums[0]+nums[1]+nums[2];//初始值
        for (int i=0;i<nums.length;i++){
            int left=i+1,right=nums.length-1;
            while (left<right) {
                int sum = nums[i] + nums[left] + nums[right];
              if (Math.abs(target-sum)<Math.abs(target-ans)){//比较谁更接近
                ans=sum;
              }
              if (sum>target){//大于目标值，降右边界
                 right--;
              }else if (sum<target){//小于目标值，升左边界
                 left++;
              }else {
                  return ans;
              }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
