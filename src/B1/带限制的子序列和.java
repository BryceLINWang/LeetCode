package B1;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 给你一个整数数组 nums 和一个整数 k ，请你返回 非空 子序列元素和的最大值，子序列需要满足：子序列中每两个 相邻 的整数 nums[i] 和 nums[j] ，它们在原数组中的下标 i 和 j 满足 i < j 且 j - i <= k 。
 *
 * 数组的子序列定义为：将数组中的若干个数字删除（可以删除 0 个数字），剩下的数字按照原本的顺序排布。
 *
 *输入：nums = [10,2,-10,5,20], k = 2
 * 输出：37
 * 解释：子序列为 [10, 2, 5, 20] 。
 */
public class 带限制的子序列和 {
    public static int constrainedSubsetSum(int[] nums, int k) {
        int N=nums.length;
        int []dp=new int[N];
        dp[0]=nums[0];
        int res=dp[0];
        Deque<Integer> deque=new LinkedList<Integer>();
        deque.offerLast(0);
        for(int i=1;i<N;i++){
            dp[i]=nums[i];
            if(dp[deque.peekFirst()]>0){
                dp[i]=nums[i]+dp[deque.peekFirst()];
            }
            while(deque.size()>0&&dp[deque.peekLast()]<dp[i]){
                deque.pollLast();
            }
            deque.offerLast(i);
            if(i-deque.peekFirst()>=k){
                deque.pollFirst();
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
    public static int constrainedSubsetSum1(int[] nums, int k) {
        int N=nums.length;
        int []dp=new int[N];
        dp[0]=nums[0];
        int res=dp[0];
        int []deque=new int[N];
        deque[0]=0;
        int left=0,right=0;
        for(int i=1;i<N;i++){
            dp[i]=nums[i];
            if(dp[deque[left]]>0){
                dp[i]=nums[i]+dp[deque[left]];
            }
            while (right-left>=0&&dp[deque[right]]<dp[i]){
                --right;
            }
            deque[++right]=i;
            if(i-deque[left]>=k){
                ++left;
            }
            res=Math.max(res,dp[i]);
        }
        return res;
    }
    public static void main(String[] args) {
        int []nums = {10,2,-10,5,20};
        int k=2;
        System.out.println(constrainedSubsetSum1(nums,k));
    }
}
