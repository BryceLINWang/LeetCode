package revi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 和为M {
    /**
     * 有一个长度为n的int数组，需要找出所有和为m的两个数并输出，请用代码实现。
     */
    public static HashMap<Integer,Integer> helper(int []a, int n, int m){
        Arrays.sort(a);
        HashMap<Integer,Integer>map=new HashMap<>();
        int left=0;
        int right=n-1;
        while (left<right){
            int sum=a[left]+a[right];
            if (sum==m){
              map.put(a[left],a[right]);
            }else if (sum<m){
                left++;
            }else {
                right--;
            }
        }
        return map;
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=br.read();
        int m=br.read();
        int []a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=br.read();
        }
        System.out.println();
    }
}
