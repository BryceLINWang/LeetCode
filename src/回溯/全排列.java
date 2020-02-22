package 回溯;

import java.util.ArrayList;
import java.util.List;

public class 全排列 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();

        return res;
    }
    private static void dfs(String cur, int left, int right, List<String> res,int n) {
        if(cur.length()==n*2){
            res.add(cur);
            return;
        }
        if (left<right){//剪枝
            return;
        }
        if (left<n){
            dfs(cur+"(",left+1,right,res,n);
        }
        if (right<n){
            dfs(cur+")",left,right+1,res,n);
        }
    }
}
