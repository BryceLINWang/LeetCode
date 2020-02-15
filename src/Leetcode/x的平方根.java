package Leetcode;

public class x的平方根 {
    public static int mySqrt(int x) {//二分查找
    if(x<2)return x;
    long num;
    int tmp,left=2,right=x/2;
    while (left<=right){
        tmp=left+(right-left)/2;
        num=(long) tmp*tmp;
        if (num>x)right=tmp-1;
        else if (num<x)left=tmp+1;
        else return tmp;
    }
    return right;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(36));
    }
}
