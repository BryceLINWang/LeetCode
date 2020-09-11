package 链表;

public class 两数相加II {
    public ListNode addInList (ListNode head1, ListNode head2) {
       ListNode l1=reverse(head1);
       ListNode l2=reverse(head2);
       ListNode head=new ListNode(0);
       ListNode cur=head;
       int cnt=0;
       while(l1!=null||l2!=null){
           int x=l1==null?0:l1.val;
           int y=l2==null?0:l2.val;
           int sum=x+y+cnt;
           cnt=cnt/10;
           cur.next=new ListNode(sum%10);
           cur=cur.next;
           if(l1!=null){
               l1=l1.next;
           }
           if (l2!=null) {
               l2=l2.next;
           }
           }
           if(cnt>0){
               cur.next=new ListNode(cnt);
           }
           ListNode res=reverse(cur);
           return res;
    }
    public ListNode reverse(ListNode head){
        ListNode res=head;
        while (head!=null){
            ListNode tmp=head.next;
            head.next=res;
            res=head;
            head=tmp;
        }
        return res;
    }
}
