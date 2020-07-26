package B1;

public class 灯泡开关四 {
    public int minFlips(String target) {
        //统计连续两位是否相同相同则ans+1
        //注意第一位是否为1,为则加1
        char []chars=target.toCharArray();
        int ans=0;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i]!=chars[i+1]){
                ans++;
            }
        }
        return chars[0]=='0'?ans:ans+1;
    }
}
