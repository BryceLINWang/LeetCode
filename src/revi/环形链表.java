package revi;

import java.util.HashSet;
import java.util.Set;

public class 环形链表 {
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
    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head.next;
        while (fast!=slow){
            if(fast==null||fast.next==null){
                return false;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return true;
    }
    public boolean hasCycle1(ListNode head) {
        Set<ListNode>set=new HashSet<>();
        while(head!=null){
          if(set.contains(head)){
              return true;
          }else {
           set.add(head);
          }
          head=head.next;
        }
        return false;

    }
}
