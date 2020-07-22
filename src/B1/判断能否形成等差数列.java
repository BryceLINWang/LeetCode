package B1;

import java.util.Arrays;

public class 判断能否形成等差数列 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int right=arr.length-1,left=0;
        for(;left<right;left++,right--){
            if(arr[left+1]-arr[left]!=arr[right]-arr[right-1]){
                return false;
            }
        }
        return true;
    }
}
