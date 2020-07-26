package B1;

import java.util.ArrayList;
import java.util.List;

public class 好叶子节点对的数量 {
    public class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
   public int ans =0;
    public int countPairs(TreeNode root, int distance) {
    dfs(root,distance);
    return ans;
    }
    public int[] dfs(TreeNode root,int dis){
        if (root==null)return null;
        if (root.left==null&&root.right==null){
            List<Integer>temp=new ArrayList<>();
            temp.add(0);
            return temp.stream().mapToInt(Integer::valueOf).toArray();
        }
        int[] left=dfs(root.left,dis);
        int[] right=dfs(root.right,dis);
        if(left!=null&&right!=null){
            for (int i = 0; i < left.length; i++){
                for(int j=0;j<right.length;j++){
                    if(left[i]+right[j]+2<=dis) ans++;
                }
            }
        }
        List<Integer>this_node=new ArrayList<>();
        if (left!=null){
            for (int l:left){
                this_node.add(l+1);
            }
        }
        if (right != null) {
            for (int r:right) {
                this_node.add(r+1);
            }
        }
        return this_node.stream().mapToInt(Integer::valueOf).toArray();
    }
}
