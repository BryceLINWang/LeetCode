package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 乌龟爬 {
    static int []x={0,1};
    static int []y={1,0};
    public static int helper(String []arr,String []strs){
        int m=Integer.parseInt(arr[1]);
       int s=Integer.parseInt(arr[2]);
       int t=Integer.parseInt(arr[3]);
       int [][]tmp=new int[m][2];
       int []res=new int[m];
       for(int i=0;i<m;i++){
           String[]strtmp=strs[i].split(" ");
           for(int j=0;j<2;j++){
               tmp[i][j]=Integer.parseInt(strtmp[j]);
           }
       }
        for(int i=0;i<m;i++){
            for(int j=0;j<2;j++){
               if(tmp[i][j]==t){
                   String[]strtmp=strs[i].split(" ");
                res[i]=Integer.parseInt(strtmp[2]);
               }
            }
        }
        Arrays.sort(res);
        return res[m-1];
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] arr=br.readLine().split(" ");
        String[] strs=new String[Integer.parseInt(arr[1])];
        for (int i=0;i<Integer.parseInt(arr[1]);i++){
            strs[i]=br.readLine();
        }
        System.out.println(helper(arr,strs));

    }
}
