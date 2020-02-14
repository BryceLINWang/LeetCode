package Leetcode;

import java.util.Stack;

public class MinStack {
    private Stack<Integer>data;//数据栈
    private Stack<Integer>helper;//辅助栈
    public MinStack() {
    data=new Stack<>();
    helper=new Stack<>();
    }

    public void push(int x) {
     data.add(x);
     if (helper.isEmpty()||helper.peek()>=x){//peek返回栈顶元素
         helper.add(x);
     }else {
         helper.add(helper.peek());
     }
    }

    public void pop() {
     if (!data.isEmpty()){
         data.pop();
         helper.pop();
     }
    }

    public int top() {
     if (!data.isEmpty()){
         return data.peek();
     }
     throw new RuntimeException("栈中元素为空，无栈顶元素");
    }

    public int getMin() {
      if (!helper.isEmpty()){
          return helper.peek();
      }
      throw new RuntimeException("栈中元素为空，无栈顶元素");
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
    }
}
