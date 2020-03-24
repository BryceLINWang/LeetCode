package Leetcode;

import java.util.Arrays;

public class HouseRobberII {
    /**
     * 将环状数组转换为0到n-2，1到n-1两个单排数组，按1号题方法求出结果取大的那个
     * @param nums
     * @return
     */
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)return 0;
        if(n==1)return nums[0];
        return Math.max(robrange(nums,0,n-2),
                robrange(nums,1,n-1));
    }
    public int robrange(int[] nums,int start,int end) {
      int dp1=0,dp2=0,res=0;
      for(int i=end;i>=start;i--){
          res=Math.max(dp1,dp2+nums[i]);
          dp2=dp1;
          dp1=res;
      }
      return res;
    }
    public int rob1(int[] nums) {
        if(nums.length == 0) return 0;
        if(nums.length == 1) return nums[0];
        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),//Arrays.copyOfRange将数组按起始位置转换为一新数组
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));
    }
    private int myRob(int[] nums) {
        int pre = 0, cur = 0, tmp;
        for(int num : nums) {
            tmp = cur;
            cur = Math.max(pre + num, cur);
            pre = tmp;
        }
        return cur;
    }


}
