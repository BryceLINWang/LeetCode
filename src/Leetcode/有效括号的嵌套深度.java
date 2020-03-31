package Leetcode;

public class 有效括号的嵌套深度 {
    public static int[] maxDepthAfterSplit(String seq) {
      int []res=new int[seq.length()];
      int cur=0;
      for(char c:seq.toCharArray()){
          res[cur++]=c=='('?cur&1:((cur+1)&1);
      }
      return res;
    }

    public static void main(String[] args) {
        String seq = "()(())()";
        System.out.println(maxDepthAfterSplit(seq));
    }
}
