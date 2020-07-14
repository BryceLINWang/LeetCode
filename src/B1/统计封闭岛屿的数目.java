package B1;

public class 统计封闭岛屿的数目 {
    static int []dx={-1,0,1,0};
    static int []dy={0,1,0-1};
    static int n,m;
    static boolean isok;
    public int closedIsland(int[][] grid) {
      n=grid.length;
      m=grid[0].length;
      int ans=0;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
             if(grid[i][j]==0){
                 isok=true;
                 dfs(grid,i,j);
                 if(isok)ans++;
             }
          }
      }
      return ans;
    }
    static void dfs(int [][]grid,int x,int y){
        grid[x][y]=1;//避免重复遍历
        if(x==0||x==n-1||y==0||y==m-1){isok=false;}
     for(int i=0;i<4;i++){
      int ddx=x+dx[i];
      int ddy=y+dy[i];
      if(ddx>=0&&ddx<n&&ddy>=0&&ddy<m&&grid[ddx][ddy]==0){
          dfs(grid,ddx,ddy);
      }
     }
    }
}
