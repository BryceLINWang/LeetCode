package Leetcode;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class 三角形最小路径和 {
    public static int minimumTotal(List<List<Integer>> triangle) {
     int []dp=new int[triangle.size()];
     List<Integer>last=triangle.get(triangle.size()-1);
     for (int i=0;i<triangle.size();i++){//取最后一层存储
         dp[i]=last.get(i);
     }
     for (int i=triangle.size()-2;i>=0;i--){//从下至上逆向求和
         List<Integer>list=triangle.get(i);
         for (int j=0;j<i+1;j++){
          dp[j]=list.get(j)+Math.min(dp[j],dp[j+1]);
         }
     }
     return dp[0];
    }

    public static void main(String[] args) {
        int arr[][]={{2},{3,4},{6,5,7}, {4,1,8,3}};
        List<List<Integer>>list=new ArrayList<List<Integer>>();
        for (int i=0;i<arr.length;i++){
            List<Integer>lis=new ArrayList<Integer>();
            for (int j=0;j<arr[i].length;j++){
                lis.add(arr[i][j]);
            }
            list.add(lis);
        }
        System.out.println(minimumTotal(list));
    }
}
