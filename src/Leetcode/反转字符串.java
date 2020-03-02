package Leetcode;

public class 反转字符串 {
    public static  void helper(char []chars,int left,int right){
        if(left>right)return;
        char tmp=chars[left];
        chars[left++]=chars[right];
        chars[right--]=tmp;
        helper(chars,left,right);
    }
    public static void reverseString(char[] s) {
      helper(s,0,s.length-1);
    }
    public static void main(String[] args) {

    }
}
