package phoenix.树;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class N叉树的前序遍历 {
    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };
    public List<Integer> preorder(Node root) {
        LinkedList<Node> stack=new LinkedList<Node>();
        LinkedList<Integer> res=new LinkedList<Integer>();
        if(root==null){
            return res;
        }
        stack.add(root);
        while (!stack.isEmpty()){
            Node node=stack.pollLast();
            res.add(node.val);
            //逆序进栈方便顺序压入结果
            Collections.reverse(node.children);
            for(Node newnode:node.children){
             stack.add(newnode);
            }
        }
    return res;
    }
}
