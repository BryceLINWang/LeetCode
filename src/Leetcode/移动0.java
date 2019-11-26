package Leetcode;

import java.util.Arrays;

public class 移动0 {
    public static void moveZeroes(int[] nums) {
        int len = nums.length - 1;
        int last = nums.length - 1;
        int count = 0;

        while (len >= 0) {
            if (nums[len] == 0) {
                count = last - len;
                for (int i = 0; i < count; i++) {
                    nums[len + i] = nums[len + i + 1];
                }
                nums[last] = 0;
                last--;
            }
            len--;
        }
    }

    public static void main(String[] args) {
        int []nums={0,1,0,3,12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
