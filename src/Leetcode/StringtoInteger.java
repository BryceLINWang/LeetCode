package Leetcode;

public class StringtoInteger {
    public int myAtoi(String str) {
      char[]arr=str.toCharArray();
      int n=arr.length;
      int cur=0;
      while(cur<n&&arr[cur]==' '){
          cur++;
      }
      if(cur==n){
          return 0;
      }
      boolean flag=false;
      if(arr[cur]=='-'){
          flag=true;
          cur++;
      }else if(arr[cur]=='+'){
          cur++;
      }else if(!Character.isDigit(arr[cur])) {//判断是否为整型
          return 0;
      }
      int res=0;
      while(cur<n&&Character.isDigit(arr[cur])){
          int num=arr[cur]- '0';
          if(res>(Integer.MAX_VALUE-num)/10){
              return flag?Integer.MIN_VALUE:Integer.MAX_VALUE;
          }
          res=res*10+num;
          cur++;
      }
      return flag?-res:res;
    }
}
