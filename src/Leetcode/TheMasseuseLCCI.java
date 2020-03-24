package Leetcode;

public class TheMasseuseLCCI {
    public static int massage(int[] nums) {
    int n=nums.length;
    if(n==0)return 0;
    if(n==1)return nums[0];
    int []dp=new int[n];
    dp[0]=nums[0];
    dp[1]=Math.max(nums[0],nums[1]);
        /**
         * dp[n]：
         * 1. 如果我们接第n个预约的话，由于相邻的预约不能接，所以dp[n] = dp[n - 2] + nums[n]（即等于到第n-2个预约的最大时长 + 第n个预约的时长）；
         * 2.  反之如果我们不接第n个预约的话，那么dp[n] = d[n - 1]（即等于到第n - 1个预约的最大时长）
         *  dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
         */
    for(int i=2;i<n;i++){
        dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
    }
    return dp[n-1];
    }
    public static int massage1(int[] nums) {
     int a=0,b=0;
     for(int i=0;i<nums.length;i++){
         int c=Math.max(b,a+nums[i]);
         a=b;
         b=c;
     }
     return b;
    }
    public static void main(String[] args) {

    }
}
