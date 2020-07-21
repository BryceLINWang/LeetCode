package B1;

public class 仅含1的子串数 {
    public int numSub(String s) {
        if(!s.contains("1")){return 0;}
        final int mod=1000000007;
     int n=s.length();
     long ans=0;
     long current=0;
     for (int i=0;i<n;i++){
         char c=s.charAt(i);
         if(c=='0'){
             //如果一个所有字符都为 1 的字符串的长度为 k，则该字符串包含的所有字符都为 1 的子字符串（包括该字符串本身）的数量是 k * (k + 1) / 2。
            ans+=current*(current+1)/2;
            ans%=mod;
            current=0;
         }else{
             current++;
         }
     }
        ans+=current*(current+1)/2;
        ans%=mod;
        return (int)ans;
    }
}
