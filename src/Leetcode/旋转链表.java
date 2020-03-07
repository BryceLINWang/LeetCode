package Leetcode;

public class 旋转链表 {
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
    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        int n;
        ListNode oldcur = head;
        for (n = 1; oldcur.next != null; n++) {
            oldcur = oldcur.next;
        }
        oldcur.next = head;
        ListNode newcur = head;
        for (int i = 0; i < n - k % n - 1; i++){
            newcur = newcur.next;
        }
        ListNode newhead=newcur.next;

        newcur.next=null;
        return newhead;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        ListNode l5=new ListNode(5);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);

       ListNode res=rotateRight(l1,2);
        while(res!=null){
            if(res.next!=null){
                System.out.print(res.val+"->");
            }else{
                System.out.print(res.val);
            }

            res=res.next;
        }
    }
}
