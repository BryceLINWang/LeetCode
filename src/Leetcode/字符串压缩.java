package Leetcode;

public class 字符串压缩 {
    public String compressString(String S) {
        int len=S.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        while (i<len){
            int j=i;
            while (j<len&&S.charAt(i)==S.charAt(j)){
                j++;
            }
            sb.append(S.charAt(i));
            sb.append(j-i);
            i=j;
        }
        String res=sb.toString();
        if (res.length()<S.length())return res;
        else return S;

    }
}
