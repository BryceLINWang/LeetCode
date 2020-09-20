package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 小昆虫 {
    //上下左右
    static int[]dx={0,0,-1,1};
    static int[]dy={-1,1,0,0};
    public static int helper(int [][]x){
        return 0;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=br.read();
        int N=0,M=0;
        for(int i=0;i<T;i++){
            if(i==0){
                 N=br.read();
                 M=br.read();
            }
            for (int j=0;j<N;j++){
                String str=br.readLine();
            }
        }

    }
}
