package Leetcode;

public class 岛屿最大面积 {
    //四个方向
    static  int [][]pos={{-1,0},{1,0},{0,-1},{0,1}};
    static int sum=0;
    public static int dfs(int x,int y,int [][]grid,int max){
     if(grid[x][y]==0){
         return max;
     }
        if(grid[x][y]==1){
            grid[x][y]=2;//用2标记
            sum++;
        }
     if(max<sum){
         max=sum;
     }
     //遍历垂直平行四个方向
     for(int i=0;i<4;i++){
         int dx=x+pos[i][0];
         int dy=y+pos[i][1];
         if(dx<0||dx>grid.length||dy<0||dy>grid[0].length){
             continue;
         }
         if(grid[dx][dy]!=2){
             max=dfs(dx,dy,grid,max);
         }
     }
     return max;
    }
    public  static int maxAreaOfIsland(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++){
                sum=0;
                max=Math.max(max,dfs(i,j,grid,max));
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [][]grid={
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };
        System.out.println(maxAreaOfIsland(grid));
    }
}
