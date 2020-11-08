package revi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class 括号的匹配 {
    public static boolean isValid(String str){
        Map<Character,Character>map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(map.get(c)==stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(isValid(str));
    }
}
