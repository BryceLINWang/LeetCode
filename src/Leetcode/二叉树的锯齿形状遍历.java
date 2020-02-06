package Leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 二叉树的锯齿形状遍历 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }

        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }
    }
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    List<List<Integer>>levels =new ArrayList<List<Integer>>();
    if(root==null)return levels;
    Queue<TreeNode>queue=new LinkedList<TreeNode>();
    int level=0;
     queue.add(root);
     while(!queue.isEmpty()){
      levels.add(new ArrayList<Integer>());
      int lens=queue.size();
      for (int i=0;i<lens;i++){
          TreeNode p=queue.poll();
          if (level%2==0){
              levels.get(level).add(p.val);
          }else {
              levels.get(level).add(0,p.val);
          }
          if(p.left!=null)((LinkedList<TreeNode>) queue).add(p.left);
          if(p.right!=null)((LinkedList<TreeNode>) queue).add(p.right);
      }
      level++;
     }
     return levels;
    }
    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        TreeNode l1 =new TreeNode(9);
        TreeNode r1 =new TreeNode(20);
        TreeNode r2 =new TreeNode(15);
        TreeNode r3 =new TreeNode(7);
        root.setLeft(l1);
        root.setRight(r1);
        r1.setLeft(r2);
        r1.setRight(r3);

        System.out.println(zigzagLevelOrder(root).toString());
    }
}
