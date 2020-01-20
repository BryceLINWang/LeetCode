package Leetcode;

public class 数组中第K个最大元素 {
    public static int findKthLargest(int[] nums, int k) {
      int len=nums.length;
      quickSort(nums,0,len-1);
      return nums[len-k];
    }
    public static void quickSort(int[] data, int left, int right){
        if(left < right){//判断边界条件
            int i = left, j = right, tmp = data[left];
            while (i < j){
                while(i < j && data[j] > tmp) {
                    j--;
                }
                if(i < j) {
                    data[i++] = data[j];
                }
                while(i < j && data[i] < tmp) {
                    i++;
                }
                if(i < j) {
                    data[j--] = data[i];
                }
            }
            data[i] = tmp;
            quickSort(data, left,i-1);
            quickSort(data, i+1, right);
        }
    }

    public static void main(String[] args) {
      int []nums={3,2,3,1,2,4,5,5,6};
      int k=4;
        System.out.println(findKthLargest(nums,4));
    }
}
