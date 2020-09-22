package Demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class 二进制1的数目 {
    public static int helper(int i){
        if (i==0)return 0;
        StringBuilder sb=new StringBuilder();
        int ans=0;
        while(i!=0){
            int tmp=i%2;
            sb.append(tmp);
            i/=2;
        }
        for(int j=0;j<sb.length();j++){
            if (sb.charAt(j)=='1')ans++;
        }
        return ans;
    }
    public static int[] countBits (int num) {
        // write code here
    int []res=new int[num+1];
    for(int i=0;i<=num;i++){
        res[i]=helper(i);
    }
    return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(countBits(5)));
    }
}
