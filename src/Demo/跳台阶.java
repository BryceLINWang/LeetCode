package Demo;

import java.util.Scanner;

public class 跳台阶 {
    public static int jump(int n){
        if(n<=0){
            return -1;
        }else if (n==1){
            return 1;
        }else {
            return 2*jump(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(jump(10));
    }
}
