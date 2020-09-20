package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 小A画画 {
    public static int helper(String str1,String str2){
        int res=0;
        char[]chars=str2.toCharArray();

        Map<Integer,Character>map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            map.put(i,chars[i]);
        }
        StringBuilder sb=new StringBuilder(str1);
        for(int i=0;i<map.size();i++){
            char tmp=map.get(i);
            for(int j=0;j<sb.length();j++){
                if(sb.charAt(j)==tmp){
                    map.put(i,'0');
                    if(sb.length()>0)sb.deleteCharAt(j);
                    res++;
                   // i--;
                    break;
                }
            }
        }
       return res;

    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1=br.readLine();//手中的
        String str2=br.readLine();//需要的

        System.out.println(helper(str1,str2));
    }
}
