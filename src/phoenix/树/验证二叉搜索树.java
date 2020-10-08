package phoenix.树;

public class 验证二叉搜索树 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public boolean isValidBST(TreeNode root) {
        return helper(root,null, null);
    }
    public boolean helper(TreeNode root, Integer low,Integer up){
        if(root==null){
            return true;
        }
        int val=root.val;
        if(low!=null&&val<=low){
            return false;
        }
        if(up!=null&&val>=up){
            return false;
        }
        if(!helper(root.left, low, val)){
            return false;
        }
        if(!helper(root.right, val, up)){
            return false;
        }
        return true;
    }
}
