package Leetcode;

public class 搜索旋转排序数组 {
    public static int search(int[] nums, int target) {
        int n=nums.length;
     if(nums==null||n==0)return -1;
     int left=0,right=n-1;
     while (left<=right){
         int mid=(left+right)/2;
     if(nums[mid]==target){
        return mid;
     }else if(nums[mid]<nums[right]){
      if (nums[mid]<target&&nums[right]>=target){
        left=mid+1;
      }else {
        right=mid-1;
      }
     }else {
         if (nums[mid]>target&&nums[left]<=target){
         right=mid-1;
         }else {
         left=mid+1;
         }
     }
     }
     return -1;
    }

    public static void main(String[] args) {
     int []nums={4,5,6,7,0,1,2};
     int target=4;
        System.out.println(search(nums,target));
    }
}
