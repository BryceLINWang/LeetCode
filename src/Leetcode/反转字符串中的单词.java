package Leetcode;

public class 反转字符串中的单词 {
    public  static String reverseWords(String s) {
    StringBuilder stb=new StringBuilder();
    String strs[]=s.split(" ");
    for(String str:strs){
        stb.append(new StringBuffer(str).reverse().toString()+" ");
    }
    return stb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
