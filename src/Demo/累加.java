package Demo;

import java.util.Scanner;

public class 累加 {
    public static int res=0;
    public static void helper(String str){
        if(str.length()==1){
            res=Integer.valueOf(str);
            return;
        }
        int num=0;
        for(int i=0;i<str.length();i++){
            num+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        helper(String.valueOf(num));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        helper(str);
        System.out.println(res);
    }
}
