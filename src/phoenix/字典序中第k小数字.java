package phoenix;

public class 字典序中第k小数字 {
    public static int findKthNumber(int n, int k) {
     int cur=1;
     k=k-1;//扣掉第一个节点
     while (k>0){
         long floor=0,first=cur,last=cur+1;
        while (first<=n){//此root范围
          floor+=Math.min(n+1,last)-first;
          first*=10;
          last*=10;
        }
        if(k>=floor){//不在这个root上
          cur+=1;//左到右
          k-=floor;
        }else {//在
          cur*=10;
          k-=1;
        }
     }
     return cur;
    }

    public static void main(String[] args) {
        int n=17;
        int k=2;
        System.out.println(findKthNumber(n,k));
    }
}
