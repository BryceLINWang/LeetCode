package B1;

import java.util.Arrays;

/**
 * 给定一个长度为 n 的非空整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 n - 1 个元素增加 1。
 */
public class 最小移动次数使数组元素相等 {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        for(int i=1;i<nums.length;i++){
            int diff=(moves+nums[i])-nums[i-1];
            nums[i]+=moves;
            moves+=diff;
        }
        return moves;
    }
}
