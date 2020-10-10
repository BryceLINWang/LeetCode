package phoenix;

public class 校园自行车分配 {
    public int[] assignBikes(int[][] workers, int[][] bikes) {
      int n=workers.length,m=bikes.length,num=n;
      int [][]a=new int[n][m];//存储工人和每辆车的曼哈顿距离
        int []state1=new int[n];//工人配对情况，配了为1
        int []state2=new int[m];//自行车配对情况
        int []res=new int[n];
        int dis=0,max=0,min;
      for(int i=0;i<n;i++){
          for(int j=0;j<m;j++){
              dis=Math.abs(workers[i][0]-bikes[j][0])+
                      Math.abs(workers[i][1]-bikes[j][1]);
              a[i][j]=dis;
              max=Math.max(max,dis);
          }
      }
      while (num>0){
          min=max+1;
          //求出未配对的自行车与人的最小曼哈顿距离
          for(int i=0;i<n;i++){
              if(state1[i]==1)continue;
              for(int j=0;j<m;j++){
                if (state2[j]==1)continue;
                else min=Math.min(min,a[i][j]);
              }
          }
          for(int i=0;i<n;i++){
              if(state1[i]==1)continue;
              for(int j=0;j<m;j++){
                  if (state2[j]==1)continue;
                  else {
                      if(min==a[i][j]){//配对
                      state1[i]=1;
                      state2[j]=1;
                      num--;
                      res[i]=j;
                      break;
                  }
                  }
              }
          }
      }
      return res;
    }
}
