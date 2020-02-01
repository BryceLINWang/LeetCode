package Leetcode;

public class 两数相加 {
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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode res=new ListNode(0);
      ListNode p=l1,q=l2,cur=res;
      int num=0;
      while (p!=null||q!=null){
          int x=(p!=null)?p.val:0;
          int y=(q!=null)?q.val:0;
          int sum=num+x+y;
          num=sum/10;
          cur.next=new ListNode(sum%10);
          cur=cur.next;
          if(p!=null){p=p.next;}
          if(q!=null){q=q.next;}
      }
      if(num>0){
          cur.next=new ListNode(num);
      }
      return res.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(3);
        l1.setNext(l2);
        l2.setNext(l3);
        ListNode l21=new ListNode(5);
        ListNode l22=new ListNode(6);
        ListNode l23=new ListNode(4);
        l21.setNext(l22);
        l22.setNext(l23);
        ListNode res=addTwoNumbers(l1,l21);
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
