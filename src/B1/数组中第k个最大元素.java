package B1;

import java.util.Arrays;

/**
 * 在未排序的数组中找到第 k 个最大的元素。请注意，你需要找的是数组排序后的第 k 个最大的元素，而不是第 k 个不同的元素。
 */
public class 数组中第k个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int len=nums.length;
        return nums[len-k];
    }
}
