package Leetcode;

import java.util.Arrays;

public class 旋转数组 {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        while (k > 0) {
            int t = 0;
            t = nums[len - 1];
            for (int i = len - 2; i >= 0; i--) {
                nums[i + 1] = nums[i];
            }
            nums[0] = t;
            k--;
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
