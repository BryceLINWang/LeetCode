package 链表;

public class 反转链表 {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val=val;
        }
    }
    public ListNode ReverseList(ListNode head) {
        ListNode newHead=null;
        while(head!=null){
           ListNode temp=head.next;
           head.next=newHead;
           newHead=head;
           head=temp;
        }
        return newHead;
    }
    public ListNode ReverseList1(ListNode head) {
        //判空
        if(head==null||head.next==null){
            return head;
        }
        //递归操作使链表反转
        ListNode cur=ReverseList1(head.next);
        //调用指向转移实现单个节点的反转
        head.next.next=head;
        //防止造成循环
        head.next=null;
        return cur;
    }
    public ListNode ReverseList2(ListNode head) {
      ListNode pre=null;
      ListNode cur=head;
      ListNode tmp=null;
      while (cur!=null){
          //临时存放
          tmp=cur.next;
          //末尾转方向
          cur.next=pre;
          //cur和pre都前进一步
          pre=cur;
          cur=tmp;
      }
      return pre;
    }
}
