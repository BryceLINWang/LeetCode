package 回溯;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 组合总和 {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        Arrays.sort(candidates);
        dfs(res,candidates,target,new ArrayList<Integer>(),0,0);
        return res;
    }

    private static void dfs(List<List<Integer>> res, int[] candidates, int target, ArrayList<Integer> objects, int sum, int start) {
      for (int i=start;i<candidates.length;i++){
          objects.add(candidates[i]);
          if ((sum+candidates[i])==target){
            res.add(new ArrayList<>(objects));
          }
          if ((sum+candidates[i])<target){
              dfs(res,candidates,target,objects,sum+candidates[i],i);
          }else {
             objects.remove(objects.size()-1);
             break;
          }
          objects.remove(objects.size()-1);
      }
    }

    public static void main(String[] args) {
        int []nums={2,3,5,7};
        int target=8;
        System.out.println(combinationSum(nums,target));
    }
}
