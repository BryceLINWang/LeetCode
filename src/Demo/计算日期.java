package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 计算日期 {
    public int helper(int y,int m1,int d1,int m2){
        int res=0;
        if(y%4==0){
            if(m1<=2){
                res=m1==2?28-d1:30+28-d1;
            }else{
                //当月日
              if((m1>7&&m1%2==0)||(m1<8&&m1%2==1)){
                  res=30-d1;
              }else {
                  res=29-d1;
              }
            }

        }else{
            if(m1<=2){
                res=m1==2?27-d1:30+27-d1;
            }else{
                if((m1>7&&m1%2==0)||(m1<8&&m1%2==1)){
                    res=30-d1;
                }else {
                    res=29-d1;
                }
            }

        }
        return res;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]strs=br.readLine().split(" ");
        int y1=Integer.parseInt(strs[0]);
        int m1=Integer.parseInt(strs[1]);
        int d1=Integer.parseInt(strs[2]);
        int w1=Integer.parseInt(strs[3]);
        int y2=Integer.parseInt(strs[4]);
        int m2=Integer.parseInt(strs[5]);
        int d2=Integer.parseInt(strs[6]);
        int res=0;
        if(y1==y2){
            if(m1==m2){
                int tmp=d1<d2?d2-d1:d1-d2;
                res=d1+tmp%7;
            }else{

            }
        }else{

        }
    }
}
