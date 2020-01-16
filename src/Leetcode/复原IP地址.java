package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 复原IP地址 {
    public static List<String> restoreIpAddresses(String s) {
        ArrayList<String>res=new ArrayList<String>();
        int len=s.length();
        for(int i=1;i<4&&i<len-2;i++){
            for(int j=i+1;j<i+4&&j<len-1;j++){
                for (int k=j+1;k<j+4&&k<len;k++){
                    if (len-k>=4){
                        continue;
                    }
                    int a=Integer.parseInt(s.substring(0,i));
                    int b=Integer.parseInt(s.substring(i,j));
                    int c=Integer.parseInt(s.substring(j,k));
                    int d=Integer.parseInt(s.substring(k));
                    if(a>255||b>255||c>255||d>255){
                        continue;
                    }
                    String ip=a+"."+b+"."+c+"."+d;
                    if (ip.length()<len+3){
                        continue;
                    }
                    res.add(ip);
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String s="25525511135";
        System.out.println(restoreIpAddresses(s));

    }
}
