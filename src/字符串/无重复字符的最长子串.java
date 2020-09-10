package 字符串;

import 强软弱虚引用.M;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 无重复字符的最长子串 {
    //滑动窗口实现
    //出现重复值窗口整体前进一格
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==1||s.length()==0){
            return s.length();
        }
       int len=0;
        //存储字符位置 有重复更新为最新一个值的end+1
        Map<Character,Integer>map=new HashMap<>();
        for(int end=0,start=0;end<s.length();end++){
            char cc=s.charAt(end);
            if(map.containsKey(cc)){
                start=Math.max(map.get(cc),start);
            }
            map.put(s.charAt(end),end+1);
            len=Math.max(len,end-start+1);
        }
        return len;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(lengthOfLongestSubstring(str));

        }
    }
}
