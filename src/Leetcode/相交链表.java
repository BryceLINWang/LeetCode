package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class 相交链表 {
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
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>set=new HashSet<>();
        while (headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while (headB!=null){
            if (set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return null;
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(4);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l21 = new ListNode(5);
        ListNode l22 = new ListNode(0);
        ListNode l23 = new ListNode(1);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        l5.setNext(null);
        l21.setNext(l22);
        l22.setNext(l23);
        l23.setNext(l3);
        ListNode res = getIntersectionNode(l1, l21);
        System.out.println(res.val);

    }
}
