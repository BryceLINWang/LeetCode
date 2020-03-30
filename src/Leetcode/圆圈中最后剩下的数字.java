package Leetcode;

import java.util.ArrayList;

public class 圆圈中最后剩下的数字 {
    public int lastRemaining(int n, int m) {
          ArrayList<Integer>list=new ArrayList<>(n);
          for(int i=0;i<n;i++){
              list.add(i);
          }
          int cur=0;
          while(n>1){
              cur=(cur+m-1)%n;
              list.remove(cur);
              n--;
        }
        return list.get(0);
    }
    public int lastRemaining1(int n, int m) {
        int ans=0;
        for(int i=2;i<=n;i++){
            ans=(ans+m)%i;
        }
        return ans;
    }
}
