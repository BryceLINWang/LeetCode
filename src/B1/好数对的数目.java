package B1;

public class 好数对的数目 {
    public int numIdenticalPairs(int[] nums) {
       int left=0,right=nums.length-1;
       int ans=0;
       for(int i=0;i<nums.length;i++){
           left=i;
           while (left<right){
              if(nums[left]==nums[right])ans++;
              right--;
           }
           right=nums.length-1;
       }
      return ans;
    }
}
