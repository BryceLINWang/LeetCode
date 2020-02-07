package Leetcode;

public class 买卖股票的最大时机 {
    public static int maxProfit(int[] prices) {
      int min=Integer.MAX_VALUE;
      int maxvalue=0;
      for (int i=0;i<prices.length;i++){
          if(prices[i]<min){
              min=prices[i];
          }else if (prices[i]-min>maxvalue){
              maxvalue=prices[i]-min;
          }
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
