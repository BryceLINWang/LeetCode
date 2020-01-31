package Leetcode;

public class 反转链表 {
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
    public static ListNode reverseList(ListNode head) {
     ListNode res=null;
     ListNode cur=head;
     while(cur!=null){
         ListNode tmpnext=cur.next;//变量临时存储next指针
         cur.next=res;
         res=cur;
         cur=tmpnext;
     }
     return res;
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
        ListNode res=reverseList(l1);
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
