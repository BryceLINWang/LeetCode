package Leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class 俄罗斯套娃信封问题 {
    public static int LIS(int []nums){
        int []dp=new int[nums.length];
        int len=0;
        for (int num:nums){
            int i=Arrays.binarySearch(dp,0,len,num);//二分搜索法，注意目标数组需排序
            if (i<0){
                i=-(i+1);
            }
            dp[i]=num;
            if (i==len){
                len++;
            }
        }
        return len;
    }
    public static int maxEnvelopes(int[][] envelopes) {
      Arrays.sort(envelopes, new Comparator<int[]>() {
          @Override
          public int compare(int[] o1, int[] o2) {//若w相同则按H降序排列
              if (o1[0]==o2[0]){
               return o2[1]-o1[1];
              }else{
               return o1[0]-o2[0];
              }
          }
      });
      int []arr=new int[envelopes.length];
      for (int i=0;i<envelopes.length;i++){
          arr[i]=envelopes[i][1];
      }
      return LIS(arr);
    }

    public static void main(String[] args) {
        int [][]arr={{4,5},{4,6},{6,7},{2,3},{1,1}};
        System.out.println(maxEnvelopes(arr));
    }
}
