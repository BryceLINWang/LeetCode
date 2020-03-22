package Leetcode;

import java.util.Arrays;

public class MinimumIncrementtoMakeArrayUnique {
    public static int minIncrementForUnique(int[] A) {
        Arrays.sort(A);
        //特
        int len=A.length;
        if (len==0)return 0;
        int move=0;
        for (int i=1;i<len;i++){
            if(A[i]<=A[i-1]){
                int tmp=A[i];
                A[i]=A[i-1]+1;
                move+=A[i]-tmp;
            }
        }
        return move;
    }

    public static void main(String[] args) {
        int []a={3,2,1,2,1,7};
        System.out.println(minIncrementForUnique(a));
    }
}
