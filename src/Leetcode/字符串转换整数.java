package Leetcode;

public class 字符串转换整数 {
    public static int myAtoi(String str) {
     int len=str.length();
     int index=0;
     while (index<len){
         if (str.charAt(index)!=' '){
             break;
         }
         index++;
     }
     if (index==len)return 0;
     //符号位
     int sign=1;
     if(str.charAt(index)=='-'){
         index++;
         sign=-1;
     }else if (str.charAt(index)=='+'){
         index++;
         sign=1;
     }
     //不能超过32位
        int res=0;
     while (index<len){
         char curchar=str.charAt(index);
         //检测是否为数字
         if (curchar>'9'||curchar<'0')break;
         if (res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&(curchar-'0')>Integer.MAX_VALUE%10)){
             return Integer.MAX_VALUE;
         }
         if (res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&(curchar-'0')>-(Integer.MIN_VALUE%10))){
             return Integer.MIN_VALUE;
         }
         res=res*10+sign*(curchar-'0');
         index++;
     }
     return res;
    }

    public static void main(String[] args) {
        String str="";
        System.out.println(myAtoi(str));
    }
}
