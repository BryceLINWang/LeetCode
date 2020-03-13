package Leetcode;

public class 二的幂 {
    public static boolean isPowerOfTwo(int n) {
        if(n==0)return false;
        while (n%2==0)n/=2;
        return n==1;
    }

    /**
     * 若 n = 2^x 且 x 为自然数（即 n 为 2 的幂），则一定满足以下条件：
     *
     * 恒有 n & (n - 1) == 0，这是因为：
     * n 二进制最高位为 1，其余所有位为 0；
     * n−1 二进制最高位为 00，其余所有位为 1；
     * 一定满足 n > 0。
     * 2^x	n	n - 1	n & (n - 1)
     * 2^0 0001	0000	(0001) & (0000) == 0
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo1(int n) {
        return n>0&&(n&(n-1))==0;
    }
    public static void main(String[] args) {
        int n=218;
        System.out.println(isPowerOfTwo(n));
        System.out.println(isPowerOfTwo1(n));
    }
}
