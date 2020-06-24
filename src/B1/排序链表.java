package B1;

public class 排序链表 {
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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //将链表分为两块
        ListNode mid=getMid(head);
        ListNode midNext=mid.next;
        mid.next=null;
        return mergeTwo(sortList(head),sortList(midNext));
    }
    //找链表中心节点
    public ListNode getMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        //定义快慢指针
        ListNode quick=head;
        ListNode slow=head;
        while(quick.next!=null&&quick.next.next!=null){
            slow=slow.next;
            quick=quick.next.next;
        }
        return slow;
    }
    public ListNode mergeTwo(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode tail=res;
        ListNode cur1=l1;
        ListNode cur2=l2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                tail.next=cur1;
                cur1=cur1.next;
            }else{
                tail.next=cur2;
                cur2=cur2.next;
            }
            tail=tail.next;
        }
        if(cur1!=null){
            tail.next=cur1;
        }else{
            tail.next=cur2;
        }
        return res.next;
    }
}
