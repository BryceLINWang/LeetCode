package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 简化路径 {
    public static String simplifyPath(String path) {
        String []strs=path.split("/");
        //如果只含/
        if(strs.length==0){
            return "/";
        }
        List<String>list=new ArrayList();
        for(int i=0;i<strs.length;i++){
         if(!strs[i].equals(".")){
             if (!strs[i].equals("")){
              if (strs[i].equals("..")){
                  if (list.size()>0){
                      list.remove(list.size()-1);
                  }
              }else {
                  list.add("/"+strs[i]);
              }
             }
         }
        }
        if(list.size()==0){
            return "/";
        }
        StringBuilder sb=new StringBuilder();
        for(String str:list){
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
    String str="/a/../../b/../c//.//";
        System.out.println(simplifyPath(str));
    }
}
