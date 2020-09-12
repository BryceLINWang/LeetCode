package 树;

public class 二叉树的最大深度 {
    public int maxDepth (TreeNode root) {
        // write code here
        if(root==null){
            return 0;
        }
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        return 1+Math.max(left,right);
    }
}
