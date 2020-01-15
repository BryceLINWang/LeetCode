package Leetcode;

public class 字符串的排列 {
    //字符串长度范围1~1000 不用考虑全排列了
    //用滑动窗口法
    public static boolean checkInclusion(String s1, String s2) {
     if(s1.length()>s2.length())return false;
     //通过都是小写字母的约束统计元素出现频率
     int []arr1=new int[26];
     int []arr2=new int[26];
     //左右指针
        int left =0,right=0;
     for(int i=0;i<s1.length();i++){
         arr1[s1.charAt(i)-'a']++;
     }
     while(right<s2.length()){
         arr2[s2.charAt(right++)-'a']++;
         if(right-left==s1.length()){
             boolean flag=true;
             for (int i=0;i<26;i++){
                 if(arr1[i]!=arr2[i]){
                     flag=false;
                     break;
                 }
             }
             if(flag) {
                 return true;
             }
             arr2[s2.charAt(left++)-'a']--;
         }
     }
     return false;
    }

    public static void main(String[] args) {
        String s1="ab";
        String s2="eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
