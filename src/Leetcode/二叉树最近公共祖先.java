package Leetcode;

public class 二叉树最近公共祖先 {
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
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q)return root;
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        if(left!=null&&left!=p&&left!=q)return left;
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if (left!=null&&right!=null){
            return root;
        }else {
            return left==null?right:left;
        }
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(3);
        TreeNode l1 =new TreeNode(5);
        TreeNode r1 =new TreeNode(1);
        TreeNode l2 =new TreeNode(6);
        TreeNode l3 =new TreeNode(2);
        TreeNode r2 =new TreeNode(0);
        TreeNode r3 =new TreeNode(8);
        TreeNode l5 =new TreeNode(7);
        TreeNode l6 =new TreeNode(4);
        root.setLeft(l1);
        root.setRight(r1);
        l1.setLeft(l2);
        l1.setRight(l3);
        l3.setLeft(l5);
        l3.setRight(l6);
        r1.setLeft(r2);
        r1.setRight(r3);
        TreeNode res=lowestCommonAncestor(root,l1,r1);
        System.out.println(res.val);
    }
}
