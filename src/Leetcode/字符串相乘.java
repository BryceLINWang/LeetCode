package Leetcode;

public class 字符串相乘 {
    public static String multiply(String num1, String num2) {
     int l1=num1.length();
     int l2=num2.length();
     int []pos=new int[l1+l2];
     for(int i=l1-1;i>=0;i--){
         for(int j=l2-1;j>=0;j--){
             int cur=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
             int p1=j+i,p2=j+i+1;
             cur+=pos[p2];
             pos[p1]+=cur/10;
             pos[p2]=cur%10;
         }
     }
     StringBuilder sb=new StringBuilder();
     for(int p:pos){
         if(!(sb.length()==0&&p==0)){
             sb.append(p);
         }
     }
     return sb.length()==0?"0":sb.toString();
    }

    public static void main(String[] args) {
        String s1="123";
        String s2="456";
        System.out.println(multiply(s1,s2));
    }
}
