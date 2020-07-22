package B1;

public class 所有蚂蚁掉下来前的最后一刻 {
    public int getLastMoment(int n, int[] left, int[] right) {
       int ans=0;
       //假设一只蚂蚁在位置 pp。如果这只蚂蚁向左移动，则它到达木板边界需要的时间是 pp。如果这只蚂蚁向右移动，则它到达木板边界需要的时间是 n-pn−p。
       for(int cur:left){
           ans=Math.max(ans,cur);
       }
       for (int cur:right){
           ans=Math.max(ans,n-cur);
       }
       return ans;
    }
}
