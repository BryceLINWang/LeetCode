package Demo;

import java.util.Arrays;
import java.util.Scanner;

public class 找最小值 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []str1=sc.next().split(",");
        String []str2=sc.next().split(",");
        int []a1=new int[str1.length];
        int []a2=new int[str2.length];
        for(int i=0;i<str1.length;i++){
            a1[i]=Integer.parseInt(str1[i]);
        }
        for(int i=0;i<str2.length;i++){
            a2[i]=Integer.parseInt(str2[i]);
        }
        Arrays.sort(a1);
        Arrays.sort(a2);
        int []res=new int[3];
        int num=0;
        int l1=1;
        int l2=1;
        res[0]=a1[0]+a2[0];
        while (num<3){
            int tmp=Integer.MAX_VALUE;
            while (l1<a1.length&&l2<a1.length){
                int num1=a1[l1-1]+a2[l2];
                int num2=a1[l1]+a2[l2-1];
                tmp=Math.min(num1,num2);
                if(tmp!=res[num]){
                    res[++num]=tmp;
                }
                if(a1[l1]>a2[l2]){
                   l1++;
                }else{
                    l2++;
                }
            }
        }
        for(int i=0;i<3;i++){
            if(i!=2){
                System.out.print(res[i]+",");
            }else {
                System.out.print(res[i]);
            }
        }
    }
}
