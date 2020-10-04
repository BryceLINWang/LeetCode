package phoenix.io;

import java.io.*;
import java.util.Arrays;

public class txtinout {
    public static void main(String[] args)throws IOException {
        //读取该文件的内容，存储到一个字符串中
        BufferedReader br=new BufferedReader(new FileReader("in.txt"));
        String str=br.readLine();
        br.close();
        //字符串转换为字符数组
        char []chars=str.toCharArray();
        Arrays.sort(chars);
        String newstr=new String(chars);
        //写入out.txt
        BufferedWriter bw=new BufferedWriter(new FileWriter("out.txt"));
        bw.write(newstr);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
