package Demo;

import java.util.Scanner;

public class 旋转数组2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str;
        String []strs=new String[n];
        for(int i=0;i<n;i++){
          str=sc.next();
          strs[i]=str;
        }
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                String []tmp=strs[j].split(",");
                if(i==n-1&&j==0){
                    System.out.println(tmp[i]);
                }else{
                    System.out.print(tmp[i]+",");
                }
            }
        }
    }
}
