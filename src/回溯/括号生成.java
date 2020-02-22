package 回溯;

import java.util.ArrayList;
import java.util.List;

public class 括号生成 {
    public static List<String> generateParenthesis(int n) {
      List<String>res=new ArrayList<>();
      if (n==0){
          return res;
      }
      dfs("",0,0,res,n);
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

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }
}
