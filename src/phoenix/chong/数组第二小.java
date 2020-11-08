package phoenix.chong;

import java.util.Arrays;

public class 数组第二小 {
    public int helper1(int []num){
        Arrays.sort(num);
        int res=num[0];
        for(int i=0;i<num.length;i++){
            if(num[0]<num[i]){
                res=num[i];
                break;
            }
        }
        return res;
    }
    public int helper2(int []num){
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int val:num){
            if(val<first){
                second=first;
                first=val;
            }else if(val<second&&val!=first){
                second=val;
            }
        }
        return second;
    }
}
