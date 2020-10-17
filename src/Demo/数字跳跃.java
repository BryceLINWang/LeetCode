package Demo;


import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class 数字跳跃 {
    public static int helper(int n,int []a){

        int res=0;
        if(a[0]==a[n-1]){
            return 1;
        }
        int []dp=new int[n];
        for(int i=0;i<n;i++){
            int tmp=a[i];
            LinkedList<Integer>list=new LinkedList<>();
           for(int j=i+1;j<n;j++){
              list.push(a[j]);
           }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();
            String str=sc.next();
            sc.close();
            int []a=new int[n];
            for(int i=0;i<str.length();i++){
                a[i]=Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            System.out.println(helper(n,a));

    }
}
