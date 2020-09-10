package 链表;

import java.util.HashSet;
import java.util.Set;

public class 判断链表中是否有环 {
    class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
    public boolean hasCycle(ListNode head) {
        if(head==null||head.next==null){
            return false;
        }
        Set<ListNode>set=new HashSet<>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else {
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }
    public boolean hasCycle1(ListNode head) {
        //追击 快慢指针
        if(head==null||head.next==null){
            return false;
        }
       ListNode fast=head.next;
       ListNode slow=head;
       while(fast!=slow){
        if(fast==null||fast.next==null){
            return false;
        }
        fast=fast.next.next;
        slow=slow.next;
       }
       return true;
    }
}
