package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 第k个排列 {
    public static String getPermutation(int n, int k) {
        if(n<=1){
            return ""+n;
        }
        ArrayList list=new ArrayList();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        k=k-1;
        StringBuilder res=new StringBuilder();
        int count=n;//计数器取位计数
        while(count>0){
            int val=1;
            for(int i=1;i<=count-1;i++){
                val=val*i;
            }
            int index=k/val;
            res.append(list.get(index));//取一位
            list.remove(index);//删一位
            k=k%val;
            count--;
        }
        return res.toString();
    }
    public static void main(String[] args) {
     int n=4,k=9;
        System.out.println(getPermutation(4,9));
    }
}
