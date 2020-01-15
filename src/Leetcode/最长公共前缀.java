package Leetcode;

import java.util.Scanner;

public class 最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        //测0返回
     if (strs==null||strs.length==0){
         return "";
     }
     int index=0;
     //最短字符串长度，数组如果
     int minlen=strs[0].length();
    for(int i=1;i<strs.length;i++){
        minlen=Math.min(minlen,strs[i].length());
    }
    for (int i=0;i<minlen;i++){
        char current=strs[0].charAt(i);
        for(String str:strs){
            //如果有不相等元素停止比较
            if(current!=str.charAt(i)){
                return str.substring(0,index);
            }
        }
        index++;
    }
        return strs[0].substring(0,index);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []strs=new String[3];
        for(int i=0;i<strs.length;i++){
            strs[i]=sc.nextLine();
        }
        System.out.println(longestCommonPrefix(strs));
    }
}
