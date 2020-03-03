package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class 存在重复元素 {
    public static boolean containsDuplicate1(int[] nums) {
        int len=nums.length;
        HashSet<Integer>set =new HashSet<>();
        for (int i=0;i<len;i++){
        if (set.contains(nums[i])){
            return true;
        }
        set.add(nums[i]);
    }
        return false;
}
    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int []nums1={1,2,3,1};
        int []nums2={1,2,3,4};
        System.out.println(containsDuplicate1(nums1));
        System.out.println(containsDuplicate2(nums2));
    }
}
