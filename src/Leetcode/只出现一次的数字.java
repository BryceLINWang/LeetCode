package Leetcode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 只出现一次的数字 {
    public static int singleNumber(int[] nums) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            num ^=nums[i];
        }
        return num;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []str=br.readLine().split(" ");
        int []nums=new int[str.length];
        for(int i=0;i<str.length;i++){
            nums[i]=Integer.parseInt(str[i]);
        }
        System.out.println(singleNumber(nums));
    }
}
