package B1;

public class 从中序与后序遍历序列构造二叉树 {
    class TreeNode {
    int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder,postorder,postorder.length-1,0,inorder.length-1);
    }
    public TreeNode helper(int[] inorder, int[] postorder,int postend,int inStart,int inEnd) {
        if(inStart>inEnd){
            return null;
        }
        int currentVal=postorder[postend];//根值
        TreeNode current=new TreeNode(currentVal);
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==currentVal){
                inIndex=i;
            }
        }
        TreeNode left=helper(inorder,postorder,postend-(inEnd-inIndex)-1,inStart,inIndex-1);
        TreeNode right=helper(inorder,postorder,postend-1,inIndex+1,inEnd);
        current.left=left;
        current.right=right;
        return current;
    }
}
