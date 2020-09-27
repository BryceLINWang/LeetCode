package 链表;

public class 删除重复链表 {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        return head;
//        int tmp=0;
//        ListNode curnode=null;
//        ListNode cur=head;
//        while (cur!=null){
//            tmp=cur.val;
//            curnode=cur.next;
//            if(curnode!=null&&tmp==curnode.val){
//                ListNode curr=cur.next.next;
//                while (curr.next!=null&&curr.val==curnode.val){
//                    curr=curr.next;
//                }
//                if(curr.next==null){
//                    cur.next=null;
//                }else{
//                    cur.next=curr;
//                    cur=cur.next;
//                }
//
//            }else {
//                cur=cur.next;
//                tmp=curnode.val;
//            }
//        }
//        return head;
    }

    public static void main(String[] args) {
     ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(3);
        ListNode l5=new ListNode(4);
        ListNode l6=new ListNode(4);
        ListNode l7=new ListNode(5);
     l1.setNext(l2);
     l2.setNext(l3);
     l3.setNext(l4);
     l4.setNext(l5);
        l5.setNext(l6);
        l6.setNext(l7);
     ListNode head=deleteDuplicates(l1);
       while (head!=null){
           if(head.next==null){
               System.out.print(head.val);
           }else {
               System.out.print(head.val+"->");
           }
           head=head.next;
       }
    }
}
