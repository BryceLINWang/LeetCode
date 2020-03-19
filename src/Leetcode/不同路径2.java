package Leetcode;

public class 不同路径2 {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
           int m=obstacleGrid.length;
           int n=obstacleGrid[0].length;
        /**
         * 如果第一个格点 obstacleGrid[0,0] 是 1，
         * 说明有障碍物，那么机器人不能做任何移动，我们返回结果 0。
         * 否则，如果 obstacleGrid[0,0] 是 0，我们初始化这个值为 1 然后继续算法
         */
        if(obstacleGrid[0][0]==1){
               return 0;
        }
        obstacleGrid[0][0]=1;
        /**
         * 遍历第一行，如果有一个格点初始值为 1 ，说明当前节点有障碍物，没有路径可以通过，设值为 0 ；
         * 否则设这个值是前一个节点的值 obstacleGrid[i,j] = obstacleGrid[i,j-1]。
         * 遍历第一列，如果有一个格点初始值为 1 ，说明当前节点有障碍物，没有路径可以通过，设值为 0 ；
         * 否则设这个值是前一个节点的值 obstacleGrid[i,j] = obstacleGrid[i-1,j]。
         */
        for(int i=1;i<m;i++){
            obstacleGrid[i][0]=(obstacleGrid[i][0]==0&&obstacleGrid[i-1][0]==1)?1:0;
        }
        for(int i=1;i<n;i++){
            obstacleGrid[0][i]=(obstacleGrid[0][i]==0&&obstacleGrid[0][i-1]==1)?1:0;
        }
        /**
         * 从 obstacleGrid[1,1] 开始遍历整个数组，如果某个格点初始不包含任何障碍物，
         * 就把值赋为上方和左侧两个格点方案数之和 obstacleGrid[i,j] = obstacleGrid[i-1,j] + obstacleGrid[i,j-1]。
         * 如果这个点有障碍物，设值为 0 ，这可以保证不会对后面的路径产生贡献。
         */
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(obstacleGrid[i][j]==0){
                    obstacleGrid[i][j]=obstacleGrid[i-1][j]+obstacleGrid[i][j-1];
                }else {
                    obstacleGrid[i][j]=0;
                }
            }
        }
        return obstacleGrid[m-1][n-1];
    }

    public static void main(String[] args) {

    }
}
