package Demo;

import java.util.Scanner;

public class 操作矩形 {
    public static String[] helper(int arr[][],int x,int y,int z){
        String []res=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int dx=arr[i][0];
            int dy=arr[i][1];
            for(int xi=0;xi<x;xi++){

            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int q=sc.nextInt();
        int arr[][]=new int[q][2];
        for(int i=0;i<q;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
    }
}
