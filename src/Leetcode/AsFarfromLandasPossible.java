package Leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class AsFarfromLandasPossible {
    public int maxDistance(int[][] grid) {
        int []dx={0,0,1,-1};
        int []dy={1,-1,0,0};
        Queue<int []>queue=new ArrayDeque<>();
        int m=grid.length,n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        //从各个陆地周围开始遍历，最后遍历到的就是最远的海洋
        boolean flag=false;
        int []point=null;
        while (!queue.isEmpty()){
            point=queue.poll();
            int x=point[0],y=point[1];
            //让四周海洋入队
            for (int i=0;i<4;i++){
                int newx=x+dx[i];
                int newy=y+dy[i];
                if(newx<0||newy<0||newx>=m||newy>=n||grid[newx][newy]!=0){
                   continue;
                }
                grid[newx][newy]=grid[x][y]+1;
                flag=true;
                queue.offer(new int[]{newx,newy});
            }
        }
        if (point==null||!flag){
            return -1;
        }
        //返回最后遍历到的
        return  grid[point[0]][point[1]]-1;
    }

}
