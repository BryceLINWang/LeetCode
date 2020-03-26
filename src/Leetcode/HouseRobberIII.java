package Leetcode;

public class HouseRobberIII {

     public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    public int rob(TreeNode root) {
    int []result=robmethod(root);
    return Math.max(result[0],result[1]);
    }

    /**
     * 任何一个节点能偷到的最大钱的状态可以定义为
     *
     * 当前节点选择不偷: 当前节点能偷到的最大钱数 = 左孩子能偷到的钱 + 右孩子能偷到的钱
     * 当前节点选择偷: 当前节点能偷到的最大钱数 = 左孩子选择自己不偷时能得到的钱 + 右孩子选择不偷时能得到的钱 + 当前节点的钱数
     * @param root
     * @return
     */
    public int [] robmethod(TreeNode root){
         if (root==null)return new  int[2];
         int []result =new int[2];
         //0,表示当前节点不偷，1表示偷
        int []left=robmethod(root.left);
        int []right=robmethod(root.right);
        result[0]=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        result[1]=root.val+left[0]+right[0];
        return result;
    }
}
