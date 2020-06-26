package B1;

import java.util.Stack;

public class 课程表2 {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if(numCourses==0)return new int[0];
        //建立邻接矩阵
        int [][]graph=new int[numCourses][numCourses];
        for (int []p:prerequisites) {
            graph[p[1]][p[0]]=1;
        }
        //记录访问状态的数组，访问过标记-1，正在访问标记1，还未0
        int []status=new  int[numCourses];
        Stack<Integer>stack=new Stack<>();//保存访问序列
        for (int i=0;i<prerequisites.length;i++){
            if (!dfs(graph,status,i,stack))return new int[0];//存在环返回0
        }
        int []res=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            res[i]=stack.pop();
        }
        return res;

    }
    private boolean dfs(int [][]graph, int []status, int i, Stack<Integer>stack){
        if(status[i]==1)return false;//当前节点在此次dfs中正在访问，说明存在环
        if(status[i]==-1)return  true;
        status[i]=1;
        for (int j=0;j<graph.length;j++){
            //dfs访问当前课程的后续课程，看是否存在环
            if(graph[i][j]==1&&!dfs(graph,status,j,stack))return false;
        }
        status[i]=-1;//标记已被访问
        stack.push(i);
        return true;
    }
}
