package phoenix.动规;

/**
 * 小扣出去秋游，途中收集了一些红叶和黄叶，他利用这些叶子初步整理了一份秋叶收藏集 leaves， 字符串 leaves 仅包含小写字符 r 和 y， 其中字符 r 表示一片红叶，字符 y 表示一片黄叶。
 * 出于美观整齐的考虑，小扣想要将收藏集中树叶的排列调整成「红、黄、红」三部分。每部分树叶数量可以不相等，但均需大于等于 1。每次调整操作，小扣可以将一片红叶替换成黄叶或者将一片黄叶替换成红叶。请问小扣最少需要多少次调整操作才能将秋叶收藏集调整完毕。
 *
 * 示例 1：
 *
 * 输入：leaves = "rrryyyrryyyrr"
 *
 * 输出：2
 *
 * 解释：调整两次，将中间的两片红叶替换成黄叶，得到 "rrryyyyyyyyrr"
 *

 */
public class 秋叶收藏集 {
    public int minimumOperations(String leaves) {
        if(leaves==null||leaves==""){
            return 0;
        }
      char []chars=leaves.toCharArray();
      int n=leaves.length();
      int [][]dp=new int[n][3];//j表示状态 0左 1中 2右
        dp[0][0]=chars[0]=='y'?1:0;//初始化 0位置是黄要挪动一次
        dp[0][1]=dp[0][2]=dp[1][2]=Integer.MAX_VALUE;//不符合题意无效区域
        int isYellow=0;
        for(int i=1;i<n;i++){
            isYellow=chars[i]=='y'?1:0;
            dp[i][0]=dp[i-1][0]+isYellow;
            dp[i][1]=Math.min(dp[i-1][0],dp[i-1][1])+(1-isYellow);
            if (i>1){
                dp[i][2]=Math.min(dp[i-1][1],dp[i-1][2])+isYellow;
            }
        }
        return dp[n-1][2];
    }
}
