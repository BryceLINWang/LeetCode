package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 多重元素 {
    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> counter = new HashMap<>();
        // 遍历每个数统计次数
        for (int num: nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
            // 如果某个数次数超过了n/2就返回
            if (counter.get(num) > nums.length / 2) {
                return num;
            }
        }
        return -1;
    }

    public int majorityElement(int[] nums) {
        return getMajority(nums, 0, nums.length - 1);
    }


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
        int []aa=new int[]{2,2,1,1,1,2,2};
        System.out.println(majorityElement1(aa));
    }
}
