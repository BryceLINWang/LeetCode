package Leetcode;

import java.util.Hashtable;

public class LRUCache {
    private int size;
    private int capacity;
    private DNode head,tail;
    private Hashtable<Integer,DNode>cahe=
            new Hashtable<Integer, DNode>();
    class DNode{
        int key;
        int value;
        DNode prev;
        DNode next;
    }
    private void addNode(DNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }
    private void removeNode(DNode node){
        DNode prev=node.prev;
        DNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    private void moveToHead(DNode node){
        removeNode(node);
        addNode(node);
    }
    private DNode popTail(){
        DNode res=tail.prev;
        removeNode(res);
        return res;
    }

    public LRUCache(int capacity) {
    this.size=0;
    this.capacity=capacity;
    head=new DNode();
    tail=new DNode();
    head.next=tail;
    tail.prev=head;
    }

    public int get(int key) {
    DNode node=cahe.get(key);
    if (node==null)return -1;
    moveToHead(node);
    return node.value;
    }

    public void put(int key, int value) {
     DNode node=cahe.get(key);
     if (node==null){
         DNode newnode =new DNode();
         newnode.key=key;
         newnode.value=value;
         cahe.put(key,newnode);
         addNode(newnode);
         ++size;
         if (size>capacity){
             DNode tail=popTail();
             cahe.remove(tail.key);
             --size;
         }
     }else {
         node.value=value;
         moveToHead(node);
     }
    }

    public static void main(String[] args) {
        LRUCache cache=new LRUCache(2);

    }
}
