package phoenix.树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的层序遍历 {
     public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>res=new ArrayList<List<Integer>>();
        if(root==null){
            return res;
        }
        Queue<TreeNode>queue=new LinkedList<>();
       queue.offer(root);
       while (!queue.isEmpty()){
           List<Integer>tmp=new ArrayList<>();
           int len=queue.size();
           for(int i=1;i<=len;i++){
               TreeNode node=queue.poll();
               tmp.add(node.val);
               if(node.left!=null){
                   queue.offer(node.left);
               }
               if(node.right!=null){
                   queue.offer(node.right);
               }
           }
           res.add(tmp);
       }
       return res;
    }
}
