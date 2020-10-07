package phoenix.链表;

import java.util.HashMap;

public class 复制带随机指针的链表 {
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val, Node next, Node random) {
            this.val = val;
            this.next = next;
            this.random = random;
        }


    }
    HashMap<Node,Node> map=new HashMap<>();
    //记录已访问过node
    public Node copyRandomList(Node head) {
      if (head==null)return null;
      if(this.map.containsKey(head)){
          return this.map.get(head);
      }
      Node node=new Node(head.val,null,null);
      this.map.put(head,node);
      node.next=this.copyRandomList(head.next);
      node.random=this.copyRandomList(head.random);
      return node;
    }
}
