package Leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 求众数 {
    public static int findcount(int[] nums, int begin, int end){
        if (begin == end)
            return nums[begin];
        else {
            int mid = (begin+end)/2;
            int left = findcount(nums,begin,mid);
            int right = findcount(nums,mid+1,end);
            if(left == right) {
                return left;
            }else{
                int countl = 0;
                int countr = 0;
                for (int i = begin; i <= end; i++)
                    if (nums[i] == left) {
                        countl++;
                    } else if (nums[i] == right) {
                        countr++;
                    }
                    if (countl > countr) {
                        return left;
                    } else {
                        return right;
                    }

            }
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []str=br.readLine().split(" ");
        int []nums=new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(findcount(nums,0,nums.length-1));
    }
}
