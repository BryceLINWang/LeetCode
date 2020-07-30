package B1;

public class 连续子数组的最大和 {
    /**
     dp[i]表示前i个数连续和的最大值
     前面连续和要<0pass从当前数开始
     **/
    public int maxSubArray(int[] nums) {
        if(nums.length==1)return nums[0];
        int n=nums.length;
        int []dp=new int[n];
        dp[0]=nums[0];
        int res=nums[0];
        for(int i=1;i<n;i++){
            if(dp[i-1]>0){
                dp[i]=dp[i-1]+nums[i];
            }else{
                dp[i]=nums[i];
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}
