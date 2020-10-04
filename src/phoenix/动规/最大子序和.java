package phoenix.动规;

public class 最大子序和 {
    public int maxSubArray(int[] nums) {
        int pre=0,maxSum=nums[0];
        for(int x:nums){
            pre=Math.max(pre+x,x);
            maxSum=Math.max(maxSum,pre);
        }
        return maxSum;
    }
}
