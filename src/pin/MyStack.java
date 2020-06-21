package pin;

import java.util.ArrayList;
import java.util.List;

class MyStack {
    private List<Integer> list;
    /** Initialize your data structure here. */
    public MyStack() {
        list=new ArrayList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        list.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(list.size()==0){
            return 0;
        }else{
            return list.remove(list.size()-1);
        }
    }

    /** Get the top element. */
    public int top() {
        if(list.size()==0){
            return 0;
        }else{
            return list.get(list.size()-1);
        }
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return list.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
