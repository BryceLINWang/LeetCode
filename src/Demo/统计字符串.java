package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 统计字符串 {
    public static String helper(String str) {
        StringBuilder sb = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; ) {

            sb.append(chars[i]);
            sb.append("_");
            int sum = 1;
            int j = i + 1;
            while (j<chars.length&&chars[j] == chars[i]) {
                j++;
                sum++;
            }
            i=j;
            sb.append(sum);
            if(j<chars.length){
                sb.append("_");
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        System.out.println(helper(str));
    }
}

