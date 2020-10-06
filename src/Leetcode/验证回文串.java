package Leetcode;

public class 验证回文串 {
    public static boolean isPalindrome(String s) {
        if(s.length()==0||s.length()==1){return true;}
        int i=0,j=s.length()-1;
        while (i<j){
            char l=s.charAt(i);
            char r=s.charAt(j);
            //大小写字母ascll差空格（32）
            if (l>= 'A' && l <= 'Z') {
                l+= ' ';
            }else if(!(l >= 'a' && l <= 'z' || l >= '0' && l <= '9')){
                i++;
                continue;
            }
            if (r>= 'A' && r<= 'Z') {
                r+= ' ';
            }else if(!(r >= 'a' && r <= 'z' || r >= '0' && r <= '9')){
                j--;
                continue;
            }
           if(l!=r){
               return false;
           }
           i++;
           j--;
        }
        return true;
    }
    public static void main(String[] args) {
    String str1="A man, a plan, a canal: Panama";
    String str2="race a car";
        System.out.println(isPalindrome(str1));
        System.out.println(isPalindrome(str2));
    }
}
