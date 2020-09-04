package revi;

import java.util.Scanner;

public class 未排序 {
    public static int maxProfit (int[] prices) {
        // write code here

        int []dp=new int[prices.length];
        dp[0]=0;
        for(int j=0;j<prices.length;j++){
            for(int i=j+1;i<prices.length;i++){
                int cur=prices[i]-prices[j];
                cur=cur>0?cur:0;
                dp[i]=Math.max(dp[i-1],dp[i]+cur);
            }
        }

        return dp[prices.length];
    }
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//
//        }
        int []a={1,2,8,3,5,7};
        System.out.println(maxProfit(a));
    }
}
