package revi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 大数乘法 {
    public static String mutiply(String num1,String num2){
      StringBuilder s1=new StringBuilder(num1);
      StringBuilder s2=new StringBuilder(num2);
      s1.reverse();
      s2.reverse();
      int m=num1.length();
      int n=num2.length();
      int []arr=new int[m+n];
      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              arr[i+j]+=(s1.charAt(i)-'0')*(s2.charAt(j)-'0');
          }
      }
      //进位
        for(int i=0;i<arr.length-1;i++){
            arr[i+1]+=arr[i]/10;
            arr[i]%=10;
        }
        StringBuilder res=new StringBuilder();
        for (int i=0;i<arr.length-1;i++){
            res.append(arr[i]);
        }
        return res.reverse().toString();
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();
        String str2=br.readLine();
        System.out.println(mutiply(str1,str2));
    }
}
