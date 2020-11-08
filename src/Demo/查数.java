package Demo;

public class 查数 {
    public static int helper(int []num, int tmp){
        int res=0;
        int left=0;
        int right=num.length-1;
        if(num[right]<tmp){
            return num.length;
        }
        if(num[left]>tmp){
            return 0;
        }
        while(left<right){
            int mid=left+right/2+1;
            if(num[mid]<tmp){
                left=mid+1;
            }else{
                right=mid-1;
            }
            if(num[left]==tmp){
                res=mid;
            }
//            if(num[right]<tmp){
//                return right+1;
//            }
//            if(num[left]>tmp){
//                return left;
//            }
        }

        return res;
    }

    public static void main(String[] args) {
        int []arr={1,1,2,2,2,4,5,6};
        System.out.println(helper(arr,3));
    }
}
