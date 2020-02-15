package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllOne {
    private HashMap<String,Node>keymap=new HashMap<String, Node>();
    private HashMap<Integer,Node>valmap=new HashMap<Integer, Node>();

    private Node head,tail;//头到尾val依次减小
     public static class Node{
       private Node next;
       private Node pre;
       private HashSet<String>keys;
       private int val;
       public Node(){
           keys=new HashSet<String>();
       }
       public Node(Integer val){
           this.val=val;
           keys=new HashSet<String>();
       }
       public Node(Integer val,String key){
           this.val=val;
           keys=new HashSet<String>();
           keys.add(key);
       }
    }
    /** Initialize your data structure here. */
    public AllOne() {
    head=new Node(0);
    tail=new Node(0);
    head.next=tail;
    tail.pre=head;
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        changeval(key,true);
    }



    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {
       if (!keymap.containsKey(key)){
           return;
       }
       changeval(key,false);
    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {
        return tail.pre == head ? "" : tail.pre.keys.iterator().next();
    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {
        return head.next == tail ? "" : head.next.keys.iterator().next();
    }
    private void changeval(String key, boolean add) {
        int cur=0;
        Node node=null;
        boolean removeNode =false;
        if (keymap.containsKey(key)){
            node=keymap.get(key);
            cur=node.val;
            node.keys.remove(key);
            keymap.remove(key);
            if (node.keys.size()==0){
                removeNode=true;
                Node next=node.next;
                Node pre=node.pre;
                next.pre=pre;
                pre.next=next;
                valmap.remove(cur);
            }
        }
        int newval=cur+(add?1:-1);
        if (newval<=0){
            return;
        }
        Node newNode=null;
        if (node==null){
            newNode=valmap.get(1);
            if (newNode!=null){
                newNode.keys.add(key);
            }else{
                newNode=new Node(1,key);
            }
        }
    }
}
