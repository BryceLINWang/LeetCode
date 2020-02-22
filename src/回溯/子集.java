package 回溯;

import java.util.ArrayList;
import java.util.List;

public class 子集 {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        dfs(nums,0,res,new ArrayList<Integer>());
        return res;
    }
    private static void dfs(int []nums, int i,List<List<Integer>>res,ArrayList<Integer> tmp) {
       res.add(new ArrayList<>(tmp));
       for (int j=i;j<nums.length;j++){
           tmp.add(nums[j]);
           dfs(nums,j+1,res,tmp);
           tmp.remove(tmp.size()-1);
       }
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4};
        System.out.println(subsets(nums));
    }
}
