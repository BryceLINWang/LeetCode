package Demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 求和 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=br.read();
        int m=br.read();
        List<Integer>list=new ArrayList<>();
        int top=n>m?m:n;

    }
    public static void helper(int top,int m,List<Integer>res){
      if (m==0){
          System.out.println(res);
          return;
        }
        if(top<=0||m<0){
          return;
        }
        List<Integer>list=new ArrayList<>(res);
        helper(top-1,m,list);
        list.add(top);
        helper(top-1,m-top,list);

    }
}
