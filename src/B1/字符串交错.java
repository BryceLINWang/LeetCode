package B1;

/**
 * 给定三个字符串 s1, s2, s3, 验证 s3 是否是由 s1 和 s2 交错组成的。
 */
public class 字符串交错 {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1=s1.length();
        int len2=s2.length();
        int len3=s3.length();
        if(len1+len2!=len3)return false;
        boolean val[][]=new boolean[len1+1][len2+1];
        val[0][0]=true;
        for(int i=1;i<=len1;i++){
            val[i][0]=val[i-1][0]&&s1.charAt(i-1)==s3.charAt(i-1);
        }
        for(int i=1;i<=len2;i++){
            val[0][i]=val[0][i-1]&&s2.charAt(i-1)==s3.charAt(i-1);
        }
        for(int i=1;i<=len1;i++){
            for(int j=1;j<=len2;j++){
                val[i][j]=(val[i][j-1]&&s2.charAt(j-1)==s3.charAt(i+j-1))||
                        (val[i-1][j]&&s1.charAt(i-1)==s3.charAt(i+j-1));
            }
        }
        return val[len1][len2];
    }
}
