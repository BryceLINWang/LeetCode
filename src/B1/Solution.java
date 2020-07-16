package B1;

import java.util.Random;

public class Solution {
    int []nums;
    int []nums1;
    Random rand=new Random();
    public Solution(int[] nums) {
     this.nums=nums;
     nums1=nums.clone();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
     return nums1;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for(int i=nums.length;i>0;i--){
            int randId=rand.nextInt(i);
            int temp=nums[randId];
            nums[randId]=nums[i-1];
            nums[i-1]=temp;
        }
        return nums;
    }
}
