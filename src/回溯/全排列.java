package 回溯;

import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        int len=nums.length;
        if(len==0){
            return res;
        }
        boolean []booleans=new boolean[len];
        dfs(nums,len,0,booleans,res,new ArrayList<Integer>());
        return res;
    }
    private static void dfs(int []nums, int len,int depth,boolean []booleans,List<List<Integer>>res,ArrayList<Integer> tmp) {
        if(depth==len) {
            // Java 中可变对象是引用传递，因此需要将当前 path 里的值拷贝出来
            res.add(new ArrayList<>(tmp));
        }
        for (int j=0;j<nums.length;j++){
            if(!booleans[j]) {
                tmp.add(nums[j]);
                booleans[j]=true;
                dfs(nums, len, depth+1, booleans, res, tmp);
                booleans[j] = false;
                tmp.remove(depth);
            }
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        System.out.println(permute(nums));
    }
}
