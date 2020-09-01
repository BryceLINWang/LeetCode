package revi;

public class 两数相加 {
    public static class ListNode{
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

        ListNode(int x) {
            val = x;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode newNode=new ListNode(0);
        ListNode current=newNode;
        int curr=0;//进位
        while (p1!=null||p2!=null){
         int x=p1!=null?p1.val:0;
         int y=p2!=null?p2.val:0;
         int sum=x+y+curr;
         curr=sum/10;
         current.next=new ListNode(sum%10);
         current=current.next;
         if(p1!=null)p1=p1.next;
        if(p2!=null) p2=p2.next;
        }
        //计算进位
        if(curr>0){
            current.next=new ListNode(curr);
        }
        return newNode.next;
    }
}
