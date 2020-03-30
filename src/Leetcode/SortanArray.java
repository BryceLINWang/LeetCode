package Leetcode;

public class SortanArray {
    public static int[] sortArray(int[] nums) {
     int len=nums.length;
     if(len==1||len==0||nums==null){
         return nums;
     }
     sort(nums,0,len-1);
     return nums;
    }
    public static void sort(int []arr,int left,int right){
        if(right<left){
            return;
        }
        int base=arr[left];
        int i=left,j=right;
        while(i!=j){
            while(arr[j]>=base&&i<j){
                j--;
            }
            while(arr[i]<=base&&i<j){
                i++;
            }
            if(i<j){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        arr[left]=arr[i];
        arr[i]=base;
        sort(arr,left,i-1);
        sort(arr,i+1,right);
    }

    public static void main(String[] args) {
        int []arr={5,1,1,2,0,0};
        System.out.println(sortArray(arr));
    }
}
