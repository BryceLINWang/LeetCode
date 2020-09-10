package 字符串;

import java.util.Scanner;

public class 比较版本号 {
    public static int compareVersion(String version1, String version2) {
        //分割
     String[] num1=version1.split("\\.");//位数不够补0
     String[] num2=version2.split("\\.");
     int n1=num1.length,n2=num2.length;
     int i1,i2;
     for(int i=0;i<Math.max(n1,n2);i++){
         i1=i<n1?Integer.parseInt(num1[i]):0;
         i2=i<n2?Integer.parseInt(num2[i]):0;
         if (i1!=i2){
             return i1>i2?1:-1;
         }
     }
     //相等
     return 0;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String ve1=sc.nextLine();
            String ve2=sc.nextLine();
            System.out.println(compareVersion(ve1,ve2));
        }
        System.out.println(Integer.parseInt("0001"));
        System.out.println(Integer.parseInt("-0001"));
       System.out.println(Integer.parseInt("-0.001"));
    }
}
