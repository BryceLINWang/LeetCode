package Leetcode;

public class 除自身以外数组的乘积 {
    public static int[] productExceptSelf(int[] nums) {
         int len=nums.length;
         int []L=new int[len];//左边元素乘积列表
         int []R=new int[len];//右边元素乘积列表
         int []answer=new int[len];
         L[0]=1;//首元素左边无元素
        R[len-1]=1;//末尾元素右边无元素
        for(int i=1;i<len;i++){
            L[i]=L[i-1]*nums[i-1];
        }
        for(int i=len-2;i>=0;i--){
            R[i]=R[i+1]*nums[i+1];
        }
        for(int i=0;i<len;i++){
            answer[i]=L[i]*R[i];
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}
