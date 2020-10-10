package phoenix.链表;

public class 重排链表 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public void reorderList(ListNode head) {
      //找到中间结点 划分左右链表
        //反转右链表
        //右链表与左链表合并
        if(head==null||head.next==null){
            return;
        }
        //中间结点
        ListNode middle=middle(head);
        //1-2-3-4-5
        ListNode left=head;
        //right: 4-5
        ListNode right=middle.next;
        //left :1-2-3
        middle.next=null;
        //反转右链表
        right=reverse(right);
        //将右插入左链表
        merge(left,right);
    }
    public ListNode middle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode res=null;
        //1->2>3
        while (cur!=null){
            ListNode tmp=cur.next;//2
            cur.next=res;//转向1->null
            res=cur;//前进 null->1
            cur=tmp;//1->2
        }
        return res;
    }
    //将右链表合并入左链表
    public void merge(ListNode left,ListNode right){
        ListNode lefttmp;
        ListNode righttmp;
        while(left.next!=null&&right!=null){
           lefttmp=left.next;
           righttmp=right.next;
           //5-4 插入1 2 3
            left.next=right;//1-5
            right.next=lefttmp;//1 5 2
            left=lefttmp;
            right=righttmp;
        }
    }
}
