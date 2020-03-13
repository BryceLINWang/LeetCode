package Leetcode;

public class 多重元素 {
    public int majorityElement(int[] nums) {
        return getMajority(nums, 0, nums.length - 1);
    }

    /**
     * 递归分治地求解子数组的众数
     * @param 子数组以及子数组首尾元素的下标
     */
    private int getMajority(int[] a, int lo, int hi) {
        if(hi == lo)    return a[lo];
        int mid = lo + (hi - lo) / 2;
        int left = getMajority(a, lo, mid);
        int right = getMajority(a, mid + 1, hi);
        if(left == right)   return left;
        if(getCount(a, lo, mid, left) > getCount(a, mid + 1, hi, right))
            return left;
        else    return right;
    }

    /**
     * @return 子数组的众数在子数组中的出现次数
     */
    private int getCount(int[] a, int lo, int hi, int key) {
        int cnt = 0;
        for(int i : a)
            if(i == key)
                cnt++;
        return cnt;
    }

   
    public static void main(String[] args) {

    }
}
