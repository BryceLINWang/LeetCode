package phoenix.每日一题;

public class 买卖股票的最佳时机II {
    //动态规划
    //dp[i][0]手里没有股票
    //dp[i][1]手里有股票
    //状态转移
    //没有股票 ：前一天就没股票 前一天还有卖出了 dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+price[i]);
    //有股票： 前一天就有股票 前一天没有今天买了 dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-price[i]);
    public int maxProfit(int[] prices) {
     int n=prices.length;
     int [][]dp=new int[n][2];
     dp[0][0]=0;
     dp[0][1]=-prices[0];
     for(int i=1;i<n;i++){
         dp[i][0]=Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
         dp[i][1]=Math.max(dp[i-1][1],dp[i-1][0]-prices[i]);
     }
     return dp[n-1][0];
    }
    public int maxProfit1(int[] prices) {
      int ans=0;
      int n=prices.length;
      for(int i=1;i<n;i++){
          ans+=Math.max(0,prices[i]-prices[i-1]);
      }
      return ans;
    }
}
