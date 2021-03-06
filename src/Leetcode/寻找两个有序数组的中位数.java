package Leetcode;

public class 寻找两个有序数组的中位数 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
    int m=nums1.length;
    int n=nums2.length;
    if (m>n){//保证m<=n
        int []temp=nums1;nums1=nums2;nums2=temp;
        int tmp=m;m=n;n=tmp;
    }
    int mini=0,maxi=m,halflen=(m+n+1)/2;
    while (mini<=maxi){
        int i=(mini+maxi)/2;
        int j=halflen-i;
        if (i<maxi&&nums2[j-1]>nums1[i]){
            mini=i+1;
        }
        else if (i > mini && nums1[i-1] > nums2[j]) {
            maxi = i - 1;
        }
        else {
            int maxLeft = 0;
            if (i == 0) { maxLeft = nums2[j-1]; }
            else if (j == 0) { maxLeft = nums1[i-1]; }
            else { maxLeft = Math.max(nums1[i-1], nums2[j-1]); }
            if ( (m + n) % 2 == 1 ) { return maxLeft; }

            int minRight = 0;
            if (i == m) { minRight = nums2[j]; }
            else if (j == n) { minRight = nums1[i]; }
            else { minRight = Math.min(nums2[j], nums1[i]); }

            return (maxLeft + minRight) / 2.0;
        }
    }
        return 0.0;
    }

    public static void main(String[] args) {
       int []a={1,2};
       int []b={1,2,3};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
