package 树;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class 二叉树中序遍历 {
    public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer>res=new ArrayList<>();
        Deque<TreeNode>stack=new LinkedList<>();
     while (root!=null||!stack.isEmpty()){
         while (root!=null){
             stack.push(root);
             root=root.left;
         }
         root=stack.pop();
         res.add(root.val);
         root=root.right;
     }
     return res;
    }
}
