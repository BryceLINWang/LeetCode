package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 字符语句倒序 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String []strs=br.readLine().split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=strs.length-1;i>=0;i--){
            if(i==0){
                sb.append(strs[i]);
            }else {
                sb.append(strs[i]);
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
}
