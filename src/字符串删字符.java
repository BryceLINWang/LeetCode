import java.util.*;

public class 字符串删字符 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(str.length()-getres(str));
        }
    }
    public static int getres(String s){
        StringBuilder sb=new StringBuilder(s);
        String str1=sb.reverse().toString();
        char []a = s.toCharArray();
        char []b=str1.toCharArray();
        int n=s.length();
        int [][] dp=new int[n+1][n+1];
        for (int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if (a[i-1]==b[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
        }
        }
        return dp[n][n];
    }
}
