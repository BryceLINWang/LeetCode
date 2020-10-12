package phoenix.树;

public class 将有序数组转换为二叉搜索树 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    /**
     * 二叉搜索树的中序遍历是升序序列，题目给定的数组是按照升序排序的
     * 有序数组，因此可以确保数组是二叉搜索树的中序遍历序列。
     * 给定二叉搜索树的中序遍历，是否可以唯一地确定二叉搜索树？
     * 答案是否定的。如果没有要求二叉搜索树的高度平衡，
     * 则任何一个数字都可以作为二叉搜索树的根节点，
     * 因此可能的二叉搜索树有多个。
     *

     * @param nums
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        //二分查找
        return helper(nums,0,nums.length);
    }
    public TreeNode helper(int[]nums,int left,int right){
        if(left>right){
            return null;
        }
        //总是选择中间结点做根结点
        int mid=(left+right)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left=helper(nums,left,mid-1);
        root.right=helper(nums,mid+1,right);
        return root;
    }
}
