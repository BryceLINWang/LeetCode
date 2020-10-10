package phoenix.滑动窗口;

public class 最小覆盖字串 {
    //滑动窗口法
    public static String minWindow(String s, String t) {
        if(s==null||s.length()==0||t==null||t.length()==0||t.length()>s.length()){
            return "";
        }
        int []needs=new int[128];
        int []window=new int[128];
        for(int i=0;i<t.length();i++){
            needs[t.charAt(i)]++;
        }
         String res="";
        int minlen=s.length()+1;//用来记录最短长度
        int count=0;
        int left=0;
        int right=0;
        while(right<s.length()){
            char c=s.charAt(right);
            window[c]++;
            if(needs[c]>0&&needs[c]>=window[c]){
                count++;
            }
            while (count==t.length()){
                char cl=s.charAt(left);
                if(needs[cl]>0&&needs[cl]>=window[cl]){
                    count--;
                }
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    res=s.substring(left,right+1);
                }
                window[cl]--;
                left++;
            }
            right++;
        }

     return res;
    }

    public static void main(String[] args) {
        String s="ADOBECODEBANC";
        String t="ABC";
        System.out.println(minWindow(s,t));
    }
}
