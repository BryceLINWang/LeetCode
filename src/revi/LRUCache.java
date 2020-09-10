package revi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
//基本思路 使用Hashmap+双向链表实现
//最近使用（进行了set/get操作）放在表头
//空间超过时，删除尾部元素
public class LRUCache {
    //本代码通过80%

    private int k;
    private DNode head=new DNode(-1,-1);
    private DNode tail=new DNode(-1,-1);
    private Map<Integer,DNode> map=new HashMap<>();

    public int[] LRU (int[][] operators, int k) {
        this.k=k;
        //链表勾连初始化
        head.next=tail;
        tail.prev=head;
        //opt首元素为2的个数
        int len = (int) Arrays.stream(operators).filter(x -> x[0] == 2).count();
        int []res=new int[len];
        for(int i=0,j=0;i<operators.length;i++){
            if(operators[i][0]==1){//opt=1
                set(operators[i][1],operators[i][2]);
            }else {//opt=2
                res[j++]=get(operators[i][1]);
            }
        }
        return res;
    }
    private void set(int key,int val){
        //先检测原key是否有值
        DNode node=map.get(key);
        if (node==null){
            if(map.size()==k){
                DNode tailnode=popTail();//拉队尾元素
                map.remove(tailnode.key);

            }
            DNode newNode=new DNode(key,val);
            map.put(key,newNode);
            addNode(newNode);
        }else {
            node.val=val;
            moveToHead(node);
        }
    }
    private int get(int key){
        if(map.containsKey(key)){
            DNode node=map.get(key);
            moveToHead(node);
            return node.val;
        }
        return -1;
    }
    //头节点加入
    public void addNode(DNode node){
        node.prev=head;
        node.next=head.next;
        head.next.prev=node;
        head.next=node;
    }

    //删除
    //将当前结点的前后指针接在一起
    public void removeNode(DNode node){
        DNode prev=node.prev;
        DNode next=node.next;
        prev.next=next;
        next.prev=prev;
    }
    //
    private void moveToHead(DNode node){
        removeNode(node);//将原结点前后指针接在一起
        addNode(node);//表头添加
    }
    private DNode popTail(){
        DNode res=tail.prev;
        removeNode(res);
        return res;
    }


    //双向链表
    static class DNode{
        DNode prev;
        DNode next;
        int val;
        int key;

        public DNode() {
        }

        public DNode(int val, int key) {
            this.val = val;
            this.key = key;
        }
    }

    public static void main(String[] args) {
        int[][] operators = {{1, 2, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int len = (int) Arrays.stream(operators).filter(x -> x[0] == 2).count();
        System.out.println(len);
    }
}
