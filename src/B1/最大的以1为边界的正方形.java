package B1;

/**
 * 给你一个由若干 0 和 1 组成的二维网格 grid，请你找出边界全部由 1 组成的最大 正方形 子网格，并返回该子网格中的元素数量。如果不存在，则返回 0。
 */
public class 最大的以1为边界的正方形 {
    public int largest1BorderedSquare(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dp_up=new int[m][n];//纵向延伸
        int [][]dp_left=new int[m][n];//横向延伸
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
               if(i==0){
                   dp_up[i][j]=grid[i][j];
               } else {
                   dp_up[i][j]=grid[i][j]==1?(dp_up[i-1][j]+1):0;
               }
                if(j==0){
                    dp_left[i][j]=grid[i][j];
                } else {
                    dp_left[i][j]=grid[i][j]==1?(dp_left[i][j-1]+1):0;
                }
            }
        }

        int max=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
              if(grid[i][j]==1){
                  int len=Math.min(dp_up[i][j],dp_left[i][j]);
                  while (dp_up[i][j-len+1]<len||dp_left[i-len+1][j]<len){
                      len--;
                  }
                  max=Math.max(max,len*len);
              }
            }
        }
    return max;
    }
}
