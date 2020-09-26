package Demo;

import java.util.List;
import java.util.Scanner;

public class 挑员工 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long m=sc.nextLong();
        long n=sc.nextLong();
        long res=0;
        long tmp=m-n;
        if(tmp<0){
            System.out.println(0);
        }else if(n>tmp){
            n=tmp;
        }
        long cur1=1;
        long cur2=1;
        if(n==1||n==(m-1)){
            res=n;
        }else if(m==n){
            res=1;
        }else{
            for(long i=m;i>=m-n+1;--i){
                cur1*=i;
            }
            for(long i=1;i<=n;++i){
                cur2*=i;
            }
            res=cur1/cur2;
        }
        System.out.println(res);
    }
}
