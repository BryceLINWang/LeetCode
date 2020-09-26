package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 旋转密码 {
    public static String[] round(String []s1){
        int n=s1[0].length();
        String []ans=new String[n];
        for(int i=0;i<n;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append(s1[j].charAt(i));

            }
            sb=sb.reverse();
            ans[i]=sb.toString();
        }
        return ans;
    }
    public static String rotatePassword (String[] s1, String[] s2) {
        // write code here
        StringBuilder sb=new StringBuilder();
        int n=s1[0].length();


        for (int k=0;k<4;k++){
            if(k>0){
                s1=round(s1);
                for(int i=0;i<s1.length;i++){
                    char []chars=s1[i].toCharArray();
                    for (int j=0;j<chars.length;j++){
                        if(chars[j]=='0'){
                            sb.append(s2[i].charAt(j));
                        }
                    }
                }
            }else{
                for(int i=0;i<s1.length;i++){
                    char []chars=s1[i].toCharArray();
                    for (int j=0;j<chars.length;j++){
                        if(chars[j]=='0'){
                            sb.append(s2[i].charAt(j));
                        }
                    }
                }
            }

        }

        return sb.toString();
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] strs1=br.readLine().split(",");
        String[] strs2=br.readLine().split(",");
        System.out.println(rotatePassword(strs1,strs2));
    }
}
