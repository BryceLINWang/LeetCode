package phoenix.深搜;

public class 安卓手势 {
    public static int numberOfPatterns(int m, int n) {
     int [][]skips=new int[10][10];
     //用来记录跳跃点
        skips[1][3]=skips[3][1]=2;
        skips[1][7]=skips[7][1]=4;
        skips[3][9]=skips[9][3]=6;
        skips[7][9]=skips[9][7]=8;
        skips[2][8]=skips[8][2]=skips[4][6]=skips[6][4]=5;
        skips[1][9]=skips[9][1]=skips[3][7]=skips[7][3]=5;
        boolean[]visited=new boolean[10];
        int res=0;
       for(int i=m;i<=n;i++){
           ////因为从1,3,7,9出发都是对称的，为什么i要减一呢，因为我们是从1出发，先天少了一个节点
           res += dfs(1,visited,skips,i-1)*4;
                       //2,4,6,8对称
           res += dfs(2,visited,skips,i-1)*4;
                       //唯独5独立
           res += dfs(5,visited,skips,i-1);

       }
        return res;
    }
    public static int dfs(int cur,boolean[]visited,int [][]skip,int count){
     if(count==0){
         return 1;
     }
     int res=0;
     visited[cur]=true;
     for(int i=1;i<=9;i++){
         int midpoint=skip[cur][i];//中间节点
         //如果这个点没毒，就判断是否有中间结点，或者中间节点已经读过
         if(!visited[i]&&(midpoint==0||visited[midpoint])){
             res+=dfs(i,visited,skip,count-1);
         }
     }
     visited[cur]=false;
     return res;
    }

    public static void main(String[] args) {
        int m=1,n=2;
        System.out.println(numberOfPatterns(1,2));
    }
}
