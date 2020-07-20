package 动规;

public class 移除盒子 {
    public int removeBoxes(int[] boxes) {
        int n=boxes.length;
      int [][][]dp=new int[n][n][n];
      return calculatePoints(boxes,dp,0,n-1,0);
    }
    public static int calculatePoints(int[] boxes, int[][][] dp, int l, int r, int k) {
     if(l>r)return 0;
     if (dp[l][r][k]!=0)return dp[l][r][k];
     while (l<r&&boxes[r]==boxes[r-1]){
         r--;
         k++;
        }//从末尾开始删除规则
        dp[l][r][k]=calculatePoints(boxes,dp,l,r-1,0)+(k+1)*(k+1);
     for(int i=l;i<r;i++){
        if(boxes[i]==boxes[r]){
            dp[l][r][k]=Math.max(dp[l][r][k],calculatePoints(boxes,dp,l,i,k+1)+calculatePoints(boxes,dp,i+1,r-1,0));
        }
     }
        return dp[l][r][k];
    }
}
