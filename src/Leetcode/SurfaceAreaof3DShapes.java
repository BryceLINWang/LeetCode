package Leetcode;

public class SurfaceAreaof3DShapes {
    public int surfaceArea(int[][] grid) {
        int N=grid.length;
        int res=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                //顶部和底部的面积
                res+=2*(grid[i][j]>0?1:0);
                //上边的面积
                res+=i-1>=0?Math.max(grid[i][j]-grid[i-1][j],0):grid[i][j];
                //下边的面积
                res+=i+1<N?Math.max(grid[i][j]-grid[i+1][j],0):grid[i][j];
                //左边的面积
                res+=j-1>=0?Math.max(grid[i][j]-grid[i][j-1],0):grid[i][j];
                //右边的面积
                res+=j+1<N?Math.max(grid[i][j]-grid[i][j+1],0):grid[i][j];

            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [][]grid={};

    }
}
