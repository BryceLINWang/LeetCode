package phoenix.链表;

public class 链表的中间结点 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode middleNode(ListNode head) {
        ListNode cur=head;
        int n=0;
        while (cur!=null){
            n++;
            cur=cur.next;
        }
        cur=head;
        int i=0;
        while (i<n/2){
            i++;
            cur=cur.next;
        }
        return cur;
    }
}
