package Demo;

import java.util.Scanner;

public class 合并链表 {
    static class Node{
        int val;
        Node next;
        public Node(){}
        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
    public static Node helper(Node l1,Node l2){
        Node res=new Node();
        Node cur=res;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                Node tmp=new Node(l1.val);
                cur.setNext(tmp);
                l1=l1.next;
            }else{
                Node tmp=new Node(l2.val);
                cur.setNext(tmp);
                l2=l2.next;
            }
            cur=cur.next;
        }
        if(l1!=null){
            cur.setNext(l1);
        }else if (l2!=null){
            cur.setNext(l2);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] strs=sc.next().split("\\|");
        String[] str1=strs[0].split(",");
        String[] str2=strs[1].split(",");
        Node l1=new Node(Integer.parseInt(str1[0]));
        Node cur1=l1;
        Node l2=new Node(Integer.parseInt(str2[0]));
        Node cur2=l2;
        for(int i=1;i<str1.length;i++){
            Node tmp=new Node(Integer.parseInt(str1[i]));
            cur1.setNext(tmp);
            cur1=cur1.next;
        }
        for(int i=1;i<str2.length;i++){
            Node tmp=new Node(Integer.parseInt(str2[i]));
            cur2.setNext(tmp);
            cur2=cur2.next;
        }
        Node res=helper(l1,l2);
        res=res.next;
        while (res!=null){
            if(res.next!=null){
                System.out.print(res.val+",");
            }else{
                System.out.print(res.val);
            }
            res=res.next;
        }
    }
}
