package Leetcode;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 三数之和 {
    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>>listList=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                break;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1,right=nums.length-1;
            while (left<right){
                if(nums[i]+nums[left]+nums[right]==0){
                    List<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    listList.add(list);
                    left++;
                    right--;
                    while (left<right&&nums[left]==nums[left-1]){
                        left++;
                    }
                    while (left<right&&nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(nums[i]+nums[left]+nums[right]<0){
                  left++;
                    while (left<right&&nums[left]==nums[left-1]){
                    left++;
                    }
                }else {
                    right--;
                    while (left<right&&nums[right]==nums[right+1]){
                    right--;
                    }
                }
            }
        }
        return listList;
    }
    public static void main(String[] args) {
  int []nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum1(nums));
    }
}
