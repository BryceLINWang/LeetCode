package B1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 从上到下打印二叉树I {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int[] levelOrder(TreeNode root) {
        if (root==null)return new int[0];
        Queue<TreeNode>queue=new LinkedList<>();
        ((LinkedList<TreeNode>) queue).add(root);
        ArrayList<Integer>ans=new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            ans.add(node.val);
            if(node.left!=null)((LinkedList<TreeNode>) queue).add(node.left);
            if(node.right!=null)((LinkedList<TreeNode>) queue).add(node.right);
        }
        int []res=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}
