package Demo;

import java.util.Scanner;

public class 装箱子 {
    public static int helper(int []arr){
        int a=arr[0];
        int b=arr[1];
        int k=arr[2];
        int v=arr[3];
        int res=0;
        if(a==0||v==0){
            return 0;
        }
        if(v>=a){
            return 1;
        }
        if(k>2){
        for(int i=b;i>0;){

                if (i>k-1){
                  i-=k-1;
                  k=k;
                }else {
                    k=i+1;
                    i=0;
                }
                a-=v*k;
                ++res;
            }

        }else {
            for(int i=b;i>0;i--){
                a-=v*k;
                ++res;
            }
        }
        if(a>=0){
            while (a>0){
                a-=v;
                ++res;
            }
        }else {
            return res;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String[]strs=sc.nextLine().split(" ");
            int[]arr=new int[strs.length];
            for(int i=0;i<strs.length;i++){
                arr[i]=Integer.parseInt(strs[i]);
            }
            System.out.println(helper(arr));
        }
    }
}
