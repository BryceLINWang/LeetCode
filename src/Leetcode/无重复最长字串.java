package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 无重复最长字串 {
    /**
     * 滑动窗口算法
     * hashset的去重性
     *
     * @param s
     * @return
     */
    public static int lengthOfLongestSubstring(String s) {
     if(s==null){
         return 0;
     }
        Set<Character>set=new HashSet<>();
        int start=0,end =0,num=0;
        while(start<s.length()&&end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end++));
                num=Math.max(num,end-start);
            }else {
                set.remove(s.charAt(start++));
            }
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int i=lengthOfLongestSubstring(str);
        System.out.println(i);
    }
}
