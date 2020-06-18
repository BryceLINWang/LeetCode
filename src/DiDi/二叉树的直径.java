package DiDi;

public class 二叉树的直径 {
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
    private static int res=0;
    public static int diameterOfBinaryTree(TreeNode root){
        maxDepth(root);
        return res;
    }
    private static int maxDepth(TreeNode root){
        if (root==null)return 0;
        int left=maxDepth(root.left);
        int right=maxDepth(root.right);
        res=Math.max(res,left+right);
        return Math.max(left,right)+1;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(1);
        TreeNode l1 =new TreeNode(2);
        TreeNode r1 =new TreeNode(3);
        TreeNode l2 =new TreeNode(4);
        TreeNode l3 =new TreeNode(5);
        TreeNode r2 =new TreeNode(6);

        root.setLeft(l1);
        root.setRight(r1);
        l1.setLeft(l2);
       r1.setRight(r2);
       l2.setLeft(l3);
       int res=diameterOfBinaryTree(root);
        System.out.println(res);
    }
}
