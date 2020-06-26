package B1;

public class 通配符匹配 {
    public static boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
    boolean[][] dp=new boolean[m+1][n+1];
    dp[0][0]=true;
    for (int i=1;i<=n;i++){
        dp[0][i]=dp[0][i-1]&&p.charAt(i-1)=='*';
    }
    //状态转移
        for (int i=1;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (s.charAt(i-1)==p.charAt(j-1)||p.charAt(j-1)=='?'){
                    dp[i][j]=dp[i-1][j-1];
                }else if(p.charAt(j-1)=='*'){
                    dp[i][j]=dp[i-1][j]||dp[i][j-1];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s="abcd";
        String p="ab*";
        System.out.println(isMatch(s,p));
    }
}
