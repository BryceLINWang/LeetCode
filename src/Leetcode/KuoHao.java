package Leetcode;

import java.util.HashMap;
import java.util.Stack;

public class KuoHao {
    private  HashMap<Character,Character>map;
    public KuoHao(){
        this.map=new HashMap<Character, Character>();
        this.map.put(')','(');
        this.map.put('}','{');
        this.map.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();
        for (int i=0;i<s.length();i++){
            char cur=s.charAt(i);
            if (this.map.containsKey(cur)){
                char topElement=stack.empty()?'#':stack.pop();
               if (topElement!=this.map.get(cur)){
                   return false;
               }
            }else {
                stack.push(cur);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str="()[]{}";
        KuoHao k=new KuoHao();
        System.out.println(k.isValid(str));
    }
}
