package Leetcode;

public class 最长回文子串 {
    public static String longestPalindrome(String s) {
     if(s==null||s.length()<1)return "";
     int start=0,end=0;
     for (int i=0;i<s.length();i++){
         int len1=expandCenter(s,i,i);//奇数形式
         int len2=expandCenter(s,i,i+1);//偶数形式
         int len=Math.max(len1,len2);//筛选出最长
         if (len>end-start){
                 start=i-(len-1)/2;
                 end=i+len/2;
         }
     }
     return s.substring(start,end+1);
    }
    public static int expandCenter(String s,int left,int right){//找出回文字串返回长度
        int l=left,r=right;
        while (l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }

    public static void main(String[] args) {
        String str="acbbca";
        System.out.println(longestPalindrome(str));
    }
}
