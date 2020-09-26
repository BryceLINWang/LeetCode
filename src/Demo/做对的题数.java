package Demo;

import java.util.Scanner;

public class 做对的题数 {
    static class Interval{
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public static int helper(String str1, String str2){
        int ans=0;
        for(int i=0,j=0;i<str1.length();i++,j++){
            if(str1.charAt(i)==str2.charAt(j)){
                ans++;
            }
        }
        return ans;
    }
    public static Interval solve (int n, int k, String str1, String str2) {
        Interval ans=new Interval(0,0);
        if(str1.equals(str2)){
             ans=new Interval(k,k);
        }else if(!str1.equals(str2)&&n==k){
            ans=new Interval(helper(str1,str2),helper(str1,str2));
        }
        int tmp=helper(str1,str2);
        if(tmp==0){
            ans=new Interval(0,n-k);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Interval res=solve(n,k,str1,str2);
        System.out.println(res.start+","+res.end);
    }
}
