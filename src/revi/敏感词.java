package revi;

import java.util.Scanner;

public class 敏感词 {
    public static boolean baohan(char []chars,char c){
        for(int i=0;i<chars.length;i++){
            if (chars[i]==c){
                return true;
            }
        }
        return false;
    }
    //判断是否为敏感词
    public static boolean helper(String str,String ss){
        boolean flag=false;
        char[]chars=str.toCharArray();
        if(ss.equals(str)){
            flag=true;
        }else {
            for(int i=0;i<ss.length();i++){
                char c=ss.charAt(i);
                if (!baohan(chars,c)){
                    flag=false;
                }
                flag=true;
            }
        }
       return flag;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            String word=sc.nextLine();
            String str1=sc.nextLine();

            //通过空格分隔
            String[] strs=word.split(" ");
            char[] chars=word.toCharArray();
            //通过长度进行分类判断
            //单词长度与敏感词一致
            //划分后单词长度等于敏感词+逗号等
            for(int i=0;i<strs.length;i++){
                int len=strs[i].length();
                if(len==str.length()){
                   if(helper(str,strs[i])){
                       strs[i]=str1;
                   }
                }else if(len==str.length()+1){
                     if (strs[i].charAt(len-1)==','){
                         String tmp=strs[i].substring(0,len-1);
                         if (helper(str,tmp)){
                             StringBuilder sb1=new StringBuilder();
                             sb1.append(str1);
                             sb1.append(',');
                             strs[i]=sb1.toString();
                         }
                     }else{
                         continue;
                     }
                     }else if(len==2*str.length()+1){
                         String[] strs1=strs[i].split(",");
                         StringBuilder sb=new StringBuilder();
                         for(int j=0;j<2;j++){
                             if(helper(str,strs1[j])){
                                 strs1[j]=str1;
                             }
                         }
                         for(int j=0;j<2;j++){
                             if(j==1){
                                 sb.append(strs1[j]);
                             }else{
                                 sb.append(strs1[j]);
                                 sb.append(',');
                             }
                         }
                      strs[i]=sb.toString();
                }else {
                    continue;
                }
            }
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<strs.length;i++){
                 if(i==strs.length-1){
                   sb.append(strs[i]);
                }else{
                     sb.append(strs[i]);
                     sb.append(" ");
                 }
            }
            System.out.print(sb.toString());
            System.out.println();
        }
    }
}
