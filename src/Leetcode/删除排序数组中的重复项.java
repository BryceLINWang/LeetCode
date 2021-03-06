package Leetcode;

public class 删除排序数组中的重复项 {
    public static int removeDuplicates(int[] nums) {
     if(nums.length==0||nums==null)return 0;
     int i=0;
     for (int j=1;j<nums.length;j++){//双指针
         if (nums[i]!=nums[j]){
             i++;
             nums[i]=nums[j];
         }
     }
     return i+1;
    }

    public static void main(String[] args) {
     int nums[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }
}
