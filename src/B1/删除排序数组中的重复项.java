package B1;

public class 删除排序数组中的重复项 {
    public int removeDuplicates(int[] nums) {
        if(nums==null||nums.length==0)return 0;
        int p=0;
        int q=1;
        while (q<nums.length){
            if(nums[q]!=nums[p]){
                nums[p+1]=nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
}
