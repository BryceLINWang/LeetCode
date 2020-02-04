package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class 环形链表2 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }

        ListNode(int x) { val = x; }
    }
    public static ListNode detectCycle(ListNode head) {
        Set<ListNode> set=new HashSet<ListNode>();
        ListNode cur=head;
        while(cur!=null){
            if (set.contains(cur)){
                return cur;
            }
            set.add(cur);
            cur=cur.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(3);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(0);
        ListNode l4=new ListNode(-4);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l2);
        ListNode res=detectCycle(l1);
        System.out.println(res.val);
    }
}
