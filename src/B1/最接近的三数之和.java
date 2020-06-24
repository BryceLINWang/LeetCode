package B1;

import java.util.Arrays;
/**
 *给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 */
public class 最接近的三数之和 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int num=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-1;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int tmp=nums[i]+nums[j]+nums[k];
                if(Math.abs(tmp-target)<Math.abs(num-target)){
                    num=tmp;
                }
                if(tmp<target){
                    j++;
                }else if(tmp>target){
                    k--;
                }else{
                    return tmp;
                }
            }
        }
        return num;
    }
}
