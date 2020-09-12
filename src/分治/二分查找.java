package 分治;

import java.util.Scanner;

public class 二分查找 {
    /**
     * 请实现有重复数字的有序数组的二分查找。
     * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
     * @param n
     * @param v
     * @param a
     * @return
     */
    public static int upper_bound_ (int n, int v, int[] a) {
        // write code here
        int flag=0;
        int left=0;
        int right=n-1;
        while(left<=right){
            flag=left+(right-left)/2;
            if(a[flag]>=v){
                if(flag==0||a[flag-1]<v){
                    return flag+1;
                }else {
                    right=flag;
                }
            }else{
                left=flag+1;
            }

        }
        return n+1;
    }
    //OJ
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int n=sc.nextInt();
            int v=sc.nextInt();
            int []a=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println(upper_bound_(n,v,a));
        }
    }
}
