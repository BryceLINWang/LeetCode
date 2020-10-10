package phoenix.二分;

public class 寻找两个正序数组的中位数 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int len1=nums1.length,len2= nums2.length;
       int totallen=len1+len2;
       if(totallen%2==1){
           int midindex=totallen/2;
           double res=helper(nums1,nums2,midindex+1);
           return res;
       }else{
           int midindex1=totallen/2-1,midindex2=totallen/2;
           double res=helper(nums1,nums2,midindex1+1)+helper(nums1,nums2,midindex2+1);
           return res;
       }
    }
    public double helper(int []nums1,int []nums2,int k){
        double res=0;
          return res;
    }
}
