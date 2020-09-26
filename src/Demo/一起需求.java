package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 一起需求 {
    public static int longestCommonSubsequence(String text1, String text2) {
        if(text1.length() == 0 || text2.length() == 0) return 0;
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 1; i<=m; i++){
            for(int j = 1; j<=n; j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
    public static void main(String[] args)throws IOException {
//        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//        int n=br.read();
//        String strs1=br.readLine();
//        String strs2=br.readLine();
        Scanner sc=new Scanner(System.in);
        String strs1=sc.nextLine();
        String strs2=sc.nextLine();
        System.out.println(longestCommonSubsequence(strs1,strs2));
    }
}
