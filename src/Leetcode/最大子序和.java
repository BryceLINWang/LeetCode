package Leetcode;

public class 最大子序和 {

    public static int Sum(int []nums, int left, int right, int mid){
        if (left==right)return nums[left];
        int leftsum=Integer.MIN_VALUE;
        int rightsum=Integer.MIN_VALUE;
        int tmp=0;
        for(int i=mid;i>=left;i--){
            tmp+=nums[i];
            leftsum=Math.max(leftsum,tmp);
        }
        tmp=0;
        for (int i=mid+1;i<=right;i++){
              tmp+=nums[i];
              rightsum=Math.max(rightsum,tmp);
        }
        return leftsum+rightsum;
    }
    public static int fen(int []nums,int left,int right){
        if (left==right)return nums[left];
        int mid=(left+right)/2;
        int leftsum=fen(nums,left,mid);
        int rightsum=fen(nums,mid+1,right);
        int sum=Sum(nums,left,right,mid);
        return Math.max(Math.max(leftsum,rightsum),sum);
    }
    public static int maxSubArray(int[] nums) {
    return fen(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
     int[]nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
