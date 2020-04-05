package Leetcode;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
class Node{
    int key;
    int value;
    int freq=1;
    public Node(){
    }

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}
public class LFUCache {
    Map<Integer,Node> cache;//存储缓存内容
    Map<Integer, LinkedHashSet<Node>>freqMap;//存储每个频次对应的双向链表，每次删除频次最小，或相同频次的顶层元素
    int size;
    int capacity;
    int min;//最小频次
    public LFUCache(int capacity) {
       cache=new HashMap<>(capacity);
       freqMap=new HashMap<>();
       this.capacity=capacity;
    }

    public int get(int key) {
     Node node=cache.get(key);
     if (node==null)return -1;
     freqInc(node);
     return node.value;
    }
    public void put(int key, int value) {
    if (capacity==0){return;}
    Node node=cache.get(key);
    if (node!=null){
        node.value=value;
        freqInc(node);
    }else {
        if (size==capacity){
            Node deadnode=removeNode();
            cache.remove(deadnode.key);
            size--;
        }
        Node newnode=new Node(key,value);
        cache.put(key,newnode);
        addNode(newnode);
        size++;
    }
    }
    //更新频次
    void freqInc(Node node) {
        //从原freq对应的链表里移除，并更新min
        int freq=node.freq;
        LinkedHashSet<Node>set=freqMap.get(freq);
        set.remove(node);
        if (freq==min&&set.size()==0){
            min=freq+1;
        }
        //加入新freq对应的链表
        node.freq++;
        LinkedHashSet<Node>newSet=freqMap.get(freq+1);
        if (newSet==null){
            newSet=new LinkedHashSet<>();
            freqMap.put(freq+1,newSet);
        }
        newSet.add(node);
    }
    void addNode(Node node){
        LinkedHashSet<Node>set=freqMap.get(1);
        if (set==null){
            set=new LinkedHashSet<>();
            freqMap.put(1,set);
        }
        set.add(node);
        min=1;
    }
    Node removeNode(){
    LinkedHashSet<Node>set=freqMap.get(min);
    Node deadnode=set.iterator().next();//next返回当前元素，并指向下一个元素
    set.remove(deadnode);
    return deadnode;
    }

    public static void main(String[] args) {
     LFUCache cache=new LFUCache(2);
     cache.put(1,1);
     cache.put(2,2);
     cache.get(1);
     cache.put(3,3);
     cache.get(2);
        cache.get(3);       // 返回 3
        cache.put(4, 4);    // 去除 key 1
        cache.get(1);       // 返回 -1 (未找到 key 1)
        cache.get(3);       // 返回 3
        cache.get(4);       // 返回 4

    }
}
