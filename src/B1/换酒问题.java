package B1;

public class 换酒问题 {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        while(numBottles!=0){
            int temp=numBottles%numExchange;
            numBottles=numBottles/numExchange;
            ans+=numBottles;
            if(numBottles+temp<numExchange){
                break;
            }
            numBottles+=temp;
        }
        return ans;
    }
}
