package revi;

public class 股票的最大利润 {
    /**
     * 前i日最大利润=max(前（i-1）日最大利润，第i日价格-前i日最低价格)
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int cost=Integer.MAX_VALUE;
        int res=0;
        for(int price:prices){
            cost=Math.min(cost,price);
            res=Math.max(res,price-cost);
        }
        return res;
    }
}
