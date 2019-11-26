package Leetcode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class 在受污染的二叉树中查找元素 {
    class FindElements {
        public class TreeNode {
            int val;
            TreeNode right;
            TreeNode left;

            TreeNode(int x) {
                val = x;
            }
        }
        Set<Integer> set = new HashSet<>();
    public FindElements(TreeNode root) {
    root.val=0;
        List<TreeNode>list =new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()){
            TreeNode t=list.get(0);
            list.remove(0);
            int val=t.val;
            set.add(val);
            if(t.left!=null){
                t.left.val=2*val+1;
                list.add(t.left);
            }
            if(t.right!=null){
                t.right.val=2*val+2;
                list.add(t.right);
            }
        }
    }
    public boolean find(int target){
        return set.contains(target);
    }
    }
}
