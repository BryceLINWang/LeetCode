package Leetcode;

import java.util.Arrays;
import java.util.Hashtable;

public class LRUCache {
    private int size;
    private int k;
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
         if (size>k){
             DNode tail=popTail();
             cahe.remove(tail.key);
             --size;
         }
     }else {
         node.value=value;
         moveToHead(node);
     }

        }
    public int[] LRU(int[][] operators,int k){
        this.size=0;
        this.k=k;
        //链表勾连初始化
        head.next=tail;
        tail.prev=head;
        //opt首元素为2的个数
        int len = (int) Arrays.stream(operators).filter(x -> x[0] == 2).count();
        int []res=new int[len];
        for(int i=0,j=0;i<operators.length;i++){
            if(operators[i][0]==1){//opt=1
                put(operators[i][1],operators[i][2]);
            }else {//opt=2
                res[j++]=get(operators[i][1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        LRUCache cache=new LRUCache();

    }
}
