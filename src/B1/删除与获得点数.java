package B1;

public class 删除与获得点数 {
    public int deleteAndEarn(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }else if(nums.length==1){
            return nums[0];
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        //新建一个数组 按照下标存放数字个数
        int all[]=new int[max+1];
        for (int num:nums)all[num]++;
        int []dp=new int[max+1];
        //0无点数
        dp[1]=all[1]*1;
        dp[2]=Math.max(dp[1],all[2]*2);
        //动态规划 已转换打家劫舍问题
        for (int i=2;i<=max;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+i*all[i]);
        }
        return dp[max];
    }
}
