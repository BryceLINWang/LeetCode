package phoenix.深搜;

public class 岛屿数量 {
    public void dfs(char[][] grid,int i,int j){
        int ni=grid.length;
        int nj=grid[0].length;
        if(i<0||j<0||i>=ni||j>=nj||grid[i][j]=='0'){
         return;
        }
        //访问过就标0
        grid[i][j]='0';
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
    public int numIslands(char[][] grid) {
     if(grid==null||grid.length==0){
         return 0;
     }
     int num=0;
     for (int i=0;i<grid.length;i++){
         for (int j=0;j<grid[0].length;j++){
             if(grid[i][j]=='1'){
               num++;
               dfs(grid,i,j);
             }
         }
     }
     return num;
    }
}
