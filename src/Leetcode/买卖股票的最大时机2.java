package Leetcode;

public class 买卖股票的最大时机2 {
    public static int maxProfit(int[] prices) {
        int maxvalue=0;
        for (int i=1;i<prices.length;i++){
           int tmp=prices[i]-prices[i-1];
           if (tmp>0)maxvalue=maxvalue+tmp;
        }
        return maxvalue;
    }

    public static void main(String[] args) {
        int []a={7,1,5,3,6,4};
        int []b={7,6,4,3,1};
        System.out.println(maxProfit(a));
        System.out.println(maxProfit(b));
    }
}
