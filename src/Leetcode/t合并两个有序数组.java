package Leetcode;

public class t合并两个有序数组 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int []copynum1=new int[m];
      System.arraycopy(nums1,0,copynum1,0,m);//copynums1
      int p1=0;
      int p2=0;
      int p=0;
      while ((p1<m)&&(p2<n)){
          nums1[p++]=(copynum1[p1]<nums2[p2])?copynum1[p1++]:nums2[p2++];
      }
      //补上剩余未添加元素
        if(p1<m)System.arraycopy(copynum1,p1,nums1,p1+p2,m+n-p1-p2);
        if(p2<n)System.arraycopy(nums2,p2,nums1,p1+p2,m+n-p1-p2);
    }
}
