package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 等分点 {
    public static List<Double> answer(double xx){
        List<Double> list=new ArrayList();
  return list;
    }
    public static boolean panduan(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)-'0'<10){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)throws IOException {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int m=sc.nextInt();
            double [][]arr=new double[m][2];
            for(int i=0;i<m;i++){
                String[] tmp=sc.nextLine().split(",");
                for(int j=0;j<2;j++){
                    if(tmp.length<2||!panduan(tmp[i])){
                        System.out.println("error");
                    }else {
                        arr[i][j]=Double.parseDouble(tmp[j]);
                    }
                }
            }
            double len=0;
            double[] minlen=new double[m-1];
            for(int i=1;i<m;i++){
                double x=Math.abs(arr[i][0]-arr[i-1][0]);
                double y=Math.abs(arr[i][1]-arr[i-1][1]);
                minlen[i-1]=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
                len+=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
            }
            //每段长度
            double xx=len/n;
            double cur=0;
            double[][]res=new double[n-1][2];
              for(int i=0;i<m-1;i++){
                 if(minlen[i]>xx){
                     double tmpx=0;
                     double tmpy=0;
                 }else if (cur>0){

                 }
              }

        }

    }
}
