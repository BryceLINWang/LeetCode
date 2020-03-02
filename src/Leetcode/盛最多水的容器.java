package Leetcode;

public class 盛最多水的容器 {
    public static int maxArea(int[] height) {
        int res=0,left=0,right=height.length-1;
        while(left<right){
            res=Math.max(res,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else {
                right--;
            }
        }
        return res;

    }

    public static void main(String[] args) {
        int nums[]={1,1};
        System.out.println(maxArea(nums));
    }
}
