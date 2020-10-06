package phoenix.树;

import java.util.LinkedList;
import java.util.List;

public class 二叉树的前序遍历 {
       class TreeNode {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode>stack =new LinkedList<>();
        LinkedList<Integer>res=new LinkedList<>();
        if(root==null){
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            TreeNode node=stack.pollLast();
            res.add(node.val);
            //进栈先右再左
            if(node.right!=null){
                stack.add(node.right);
            }
            if(node.left!=null){
                stack.add(node.left);
            }
        }
        return res;
    }
}
