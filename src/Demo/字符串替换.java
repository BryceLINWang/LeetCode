package Demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class 字符串替换 {
    public static String helper(String str){
        //Stack<Character>stack=new Stack<>();
        if(str==null||str==""){
            return "";
        }

        String res="";
        char []chars=str.toCharArray();
        int left=0;
        int right=str.length()-1;
        if(!str.contains("{{")&&!str.contains("}}")){
            return str;
        }else if(str.contains("{{")&&!str.contains("}}")){
            return helper(str.substring(str.indexOf("{{")+2));
        }else if(!str.contains("{{")&&str.contains("}}")){
            return helper(str.substring(0,str.indexOf("}}")));
        }
        while(left<right){
            if(chars[left]!='{'){
                left++;
            }
            if(chars[right]!='}'){
                right--;
            }
            if(chars[left]=='{'&&chars[right]=='}'){
                left=chars[left]=='{'?left+=2:left;
                right=chars[right]=='}'?right-=2:right;
                res=helper(str.substring(left,right+1));
                return res;
            }
        }
        return res;
    }
    public static String parse(String template, int count, Map<String,String>dict){
       String cur=helper(template);
       StringBuilder sb=new StringBuilder();
       if(cur==""&&count==0){
           return template;
       }
       if(!(cur=="")&&count==0){
          return template;
       }
       String left=template.substring(template.indexOf(String.valueOf(cur.charAt(0)))-2);
        String right=template.substring(template.indexOf(String.valueOf(cur.charAt(cur.length()-1)))+2);
       if(dict.get("cur")!=null){
           cur=dict.get("cur");
       }
       sb.append(left);
       sb.append(cur);
       sb.append(right);
       return sb.toString();
    }

    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=sc.nextInt();
        for(int i=0;i<count;i++){
            String strs=sc.nextLine();

            String []tmp=strs.split("->");
            map.put(tmp[0],tmp[1]);
        }


        System.out.println(parse(str,count,map));
    }
}
