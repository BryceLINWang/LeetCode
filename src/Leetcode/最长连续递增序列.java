package Leetcode;

public class 最长连续递增序列 {
    public static int findLengthOfLCIS(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int res=0,count=1;
        int tmp=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>tmp){
                count++;
                tmp=nums[i];
            }else {
                if (count>res){
                    res=count;
                }
                tmp=nums[i];
                count=1;
            }

        }
        if (res<count){
            res=count;
        }
        return res;
    }

    public static void main(String[] args) {
        int []nums={1,3,5,4,7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
