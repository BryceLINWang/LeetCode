package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 计算器 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char []chars=str.toCharArray();

        for(int i=0;i<chars.length;i++){
            int cur=0;
            while (chars[i]>='0'&&chars[i]<='9'){
                cur=cur*10;
            }
        }
    }
}
