package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.”
 */
public class 删除公共字符 {

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        String ss=br.readLine();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            boolean flag=true;
            for(char c:ss.toCharArray()){
                if(str.charAt(i)==c){
                   flag=false;
                }
            }
            if(flag) {
                sb.append(str.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
