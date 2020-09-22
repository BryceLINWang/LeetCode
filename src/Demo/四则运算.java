package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 四则运算 {
//    public int calculate (String input) {
//        // write code here
//        char[]chars=input.toCharArray();
//
//        Map<Integer,Character> map=new HashMap<>();
//        for(int i=0;i<chars.length;i++){
//            map.put(i,chars[i]);
//        }
//
//    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []str=br.readLine().split(" ");
        int res=0;
        int cur=0;

        Map<String,Integer> map=new HashMap<>();
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<str.length;i++){
            map.put(str[i],i);
        }
        for(int i=0;i<str.length;i++){
            if(str[i]!="*"&&str[i]!="/"&&str[i]!="+"&&str[i]!="-"){
                cur=Integer.parseInt(str[i]);
            }
            if(str[i]=="*"){
                cur=Integer.parseInt(str[i-1])*Integer.parseInt(str[i+1]);
            }
            if(str[i]=="/"){
                cur=Integer.parseInt(str[i-1])/Integer.parseInt(str[i+1]);
            }
            if(str[i]=="+"){
                for(int j=i+1;j<str.length;j++){
                    if(str[j]=="*"||str[j]=="/"){
                        int tmp=Integer.parseInt(str[j-1])*Integer.parseInt(str[j+1]);
                        if(tmp!=0){
                            tmp=tmp*Integer.parseInt(str[j+1]);
                        }
                    }
                }
            }
            if(str[i]=="-"){
                stack.push(Integer.parseInt(str[i-1]));
            }
        }

    }
}
