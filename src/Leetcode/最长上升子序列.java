package Leetcode;

public class 最长上升子序列 {
    public static int lengthOfLIS(int[] nums) {
     if(nums.length==0)return 0;
     int dp[]=new int[nums.length];
     dp[0]=1;
     int maxres=1;
     for(int i=1;i<dp.length;i++){
         int maxval=0;
         for (int j=0;j<i;j++){
             if(nums[i]>nums[j]){
                 maxval=Math.max(maxval,dp[j]);
             }
         }
         dp[i]=maxval+1;
         maxres=Math.max(maxres,dp[i]);
     }
     return maxres;
    }

    public static void main(String[] args) {
    int[]nus={10,9,2,5,3,7,101};
        System.out.println(lengthOfLIS(nus));
    }
}
