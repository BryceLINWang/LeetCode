package Demo;
class Node{
    int val;
    Node next;
    public Node(){
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(int val){
        this.val=val;
    }
}
public class 反转 {
    public static Node helper(Node root){
        Node cur=null;
        while(root!=null){
            Node tmp=root.next;
            root.next=cur;
            cur=root;
            root=tmp;
        }
        return cur;
    }
    public static void main(String[] args) {

    }
}
