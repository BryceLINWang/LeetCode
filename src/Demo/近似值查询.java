package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class 近似值查询 {
    public static long  findABS(long []arr,long qz){
        long res=0;
        for(long n:arr){
            if(n==qz)res=n;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]>qz&&k==0){
                res=arr[k];
            }else if(arr[k]<qz&&k==arr.length-1){
                res=arr[k];
            }else if(k>0&&arr[k]>qz&&arr[k-1]<qz){
                res=arr[k]-qz<qz-arr[k-1]?arr[k]:arr[k-1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long q=sc.nextLong();
        long[]arr=new long[(int)n];
        long []qs=new long[Math.toIntExact(q)];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLong();
        }
        for(int i=0;i<q;i++){
            qs[i]=sc.nextLong();
        }

        for(int i=0;i<q;i++){
            System.out.println(findABS(arr,qs[i]));
        }
    }
}
