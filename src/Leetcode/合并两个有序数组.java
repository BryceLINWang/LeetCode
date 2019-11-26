package Leetcode;

public class 合并两个有序数组 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     int l1=m-1;
     int l2=n-1;
     int k=m+n-1;
     while (l1>=0&&l2>=0){
         if (nums1[l1]>nums2[l2]){
         nums1[k--]=nums1[l1--];
         }else {
          nums1[k--]=nums2[l2--];
         }
     }
     while (l2>=0){
         nums1[k--]=nums2[l2--];
     }
    }
    public static void out(int []a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums1=new int[6];
        nums1[0]=1;
        nums1[1]=2;
        nums1[2]=3;
        int []nums2={2,5,6};
        out(nums1);
        out(nums2);
        merge(nums1,3,nums2,3);
       out(nums1);
    }
}
