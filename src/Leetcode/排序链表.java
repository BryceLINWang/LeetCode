package Leetcode;

public class 排序链表 {
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
    public static ListNode sortList(ListNode head) {
     if(head==null||head.next==null){
         return head;
     }
     ListNode pre=head;
     ListNode slow=head;
     ListNode fast=head;
     while(fast!=null&&fast.next!=null){
       pre=slow;
       slow=slow.next;
       fast=fast.next.next;
     }
     pre.next=null;
     return  mergeTwoLists(sortList(head),sortList(slow));
    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if (l2==null){
            return l1;
        }else if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next=mergeTwoLists(l2.next,l1);
            return l2;
        }
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(4);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(1);
        ListNode l4=new ListNode(3);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        ListNode res=sortList(l1);
        while(res!=null){
            if(res.next!=null){
                System.out.print(res.val+"->");
            }else{
                System.out.print(res.val+"->"+null);
            }

            res=res.next;
        }
    }
}
