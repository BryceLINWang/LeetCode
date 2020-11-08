package Demo;

import java.util.HashSet;
import java.util.Set;

public class 字符串去重 {
    public static boolean helper(String str,char c){
        if(str==null||str==""){
            return false;
        }
        for (char cc:str.toCharArray()){
            if(cc==c){
                return true;
            }
        }
        return false;
    }
    public static String removeDuplicatedChars (String str) {
        // write code here
        if(str==null||str==""){
            return "";
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<str.length();i++){
          if(helper(res.toString(),str.charAt(i))==false){
              res.append(str.charAt(i));
          }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String str="abcbdde";
        System.out.println(removeDuplicatedChars(str));
    }
}
