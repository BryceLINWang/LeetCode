package Leetcode;

public class 整数反转 {
    public static int reverse(int x) {
       int res=0;
       while(x!=0){
        int num=x%10;
        x/=10;
        if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10&&num>7))return 0;
        if(res<Integer.MIN_VALUE/10||(res==Integer.MIN_VALUE/10&&num<-8))return 0;
        res=res*10+num;
       }
       return res;
    }

    public static void main(String[] args) {
        int x=-7859;
        System.out.println(reverse(x));
    }
}
