package phoenix.牛客;

import java.util.Scanner;

public class 在行列都排好序的矩阵中找指定的值 {
    public static String helper(int N,int M,int K,int [][]arr){
        if(arr==null||N==0||M==0){
            return "No";
        }
        int i=0;
        int j=M-1;
        while(i<N&&j>=0){
            int num=arr[i][j];
            if(num==K){
                return "Yes";
            }else if(num<K){
                i++;
            }else{
                j--;
            }
        }
        return "No";
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int K=sc.nextInt();
        int [][]arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print(helper(N,M,K,arr));
    }
}
