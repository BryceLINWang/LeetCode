package phoenix;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node pre;

        public Node() {
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    private Map<Integer,Node>map=new HashMap<>();
    private int size;
    private int capacity;
    private Node head, tail;
    public LRUCache(int capacity){
        this.size=0;
        this.capacity=capacity;
        head =new Node();
        tail =new Node();
        head.next=tail;
        tail.pre=head;
    }
    public int get(int key){
        Node node=map.get(key);
        if(node==null){
            return -1;
        }
        moveToHead(node);
        return node.val;
    }
    public void put(int key, int val){
        Node node =map.get(key);
        //看原表存在不
        if(node==null){
            Node newnode=new Node(key,val);
            map.put(key,newnode);
            //添加到双向链表头部
            addToHead(newnode);
            ++size;
            if (size>capacity){
                //超出容量 删除尾部节点
                Node tail=removeTail();
                //删除哈希表中值
                map.remove(tail.key);
                --size;
            }
        }else {
            //如果有该值修改 放头部
            node.val=val;
            moveToHead(node);
        }

    }
    private void addToHead(Node node){
        node.pre=head;
        node.next=head.next;
        head.next.pre=node;
        head.next=node;
    }
    private void removeNode(Node node){
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
    private void moveToHead(Node node){
      removeNode(node);
      addToHead(node);
    }
    private Node removeTail(){
        Node res=tail.pre;
        removeNode(res);
        return res;
    }
}
