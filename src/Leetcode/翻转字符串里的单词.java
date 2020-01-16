package Leetcode;

public class 翻转字符串里的单词 {
    public static  String reverseWords(String s) {
    if(s==null||"".equals(s.trim())){
        return "";
    }
    StringBuilder sb=new StringBuilder();
    String []strs=s.trim().split("\\s+");//正则表达式\s表示空白字符+表示一个或多个
        for(int i=strs.length-1;i>=0;i--){
            if(i==0){
                sb.append(strs[i]);
            }else{
                sb.append(strs[i]+" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
       String str= "the sky is blue";
        System.out.println(reverseWords(str));
    }
}
