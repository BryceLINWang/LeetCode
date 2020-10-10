package Demo;

import java.util.Scanner;

public class 整数分解 {
   private static long k;
   private static long n;
   private static long res;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextLong();
        k=sc.nextLong();
        dfs(1,0,0);
        System.out.println(res);
    }
    private static void dfs(long cur,long sum,long cnt){
        if(sum==n&&cnt<=k){
            res++;
            return;
        }
        if(cnt>=k||cnt>n){
            return;
        }
        for(long i=cur;i<=n-sum;i++){
            dfs(i,sum+i,cnt+1);
        }
    }
}
