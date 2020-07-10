package B1;

import java.util.Arrays;

/**
 * 给定一个整型数组，在数组中找出由三个数组成的最大乘积，并输出这个乘积。
 */
public class 三个数的最大乘积 {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int ans=0;
        if(nums[j]<=0||nums[i]>=0){
            ans=nums[j]*nums[j-1]*nums[j-2];
        }else{
            int valfront=nums[i]*nums[i+1];
            int valbehind=nums[j-1]*nums[j-2];
            if (valfront>valbehind) {
                ans=valfront*nums[j];
            }else {
                ans=valbehind*nums[j];
            }
        }
        return ans;
    }
}
