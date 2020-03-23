package Leetcode;

public class MiddleoftheLinkedList {
/**
 * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
 * 如果有两个中间结点，则返回第二个中间结点。
 */
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
public ListNode middleNode(ListNode head) {
   int n=0;
    ListNode cur=head;
    while(cur!=null){
        n++;
        cur=cur.next;
    }
    int i=0;
    cur=head;
    while(i<n/2){
     i++;
     cur=cur.next;
    }
    return cur;
}
    public ListNode middleNode1(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
