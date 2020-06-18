package DiDi;

public class 合并k个排序链表 {
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
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists.length==0)return null;
        int len=lists.length;
        while(len>1){
            for (int i=0;i<len/2;i++){
                lists[i]=merge(lists[i],lists[len-1-i]);
            }
            len=(len+1)/2;
        }
        return lists[0];
    }
    private static ListNode merge(ListNode l1,ListNode l2){
        ListNode res=new ListNode(0);
        ListNode tail=res;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                tail.next=l1;
                l1=l1.next;
            }else{
                tail.next=l2;
                l2=l2.next;
            }
            tail=tail.next;
        }
        if(l1!=null){
            tail.next=l1;
        }else {
            tail.next=l2;
        }
        return res.next;
    }

    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(4);
        ListNode l3=new ListNode(5);
        l1.setNext(l2);
        l2.setNext(l3);
        ListNode l21=new ListNode(1);
        ListNode l22=new ListNode(3);
        ListNode l23=new ListNode(4);
        l21.setNext(l22);
        l22.setNext(l23);
        ListNode l31=new ListNode(2);
        ListNode l32=new ListNode(6);
        l31.setNext(l32);
        ListNode []lists={l1,l21,l31};
        ListNode res=mergeKLists(lists);
        while (res!=null){
            if(res.next!=null){
                System.out.print(res.val+"->");
            }else{
                System.out.print(res.val);
            }
            res=res.next;
        }
    }
}
