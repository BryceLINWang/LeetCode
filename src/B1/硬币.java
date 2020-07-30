package B1;

public class 硬币 {
    static final int mod=1000000007;
    static int []coins={1,5,10,25};
    public static int waysToChange(int n) {
        if(n==0)return 0;
        else if(n<5)return 1;
        int []dp=new int[n+1];
        dp[0]=1;
        for(int coin:coins){
            for(int i=coin;i<=n;i++){
                dp[i]=(dp[i]+dp[i-coin])%mod;
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {
        int n=24;
        System.out.println(waysToChange(n));
    }
}
