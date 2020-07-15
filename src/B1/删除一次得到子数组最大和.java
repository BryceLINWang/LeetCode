package B1;

public class 删除一次得到子数组最大和 {
    public static int maximumSum(int[] arr) {
      int len=arr.length;
      int []f=new int[len];//不删除元素情况下最大和
        int []r=new int[len];//删除情况下最大元素和
        int res=arr[0];
        f[0]=arr[0];
        r[0]=-200001;
      for(int i=1;i<len;i++){
          f[i]=Math.max(f[i-1]+arr[i],arr[i]);//要么是当前元素累加之前的和，要么是重新从当前元素开始
          r[i]=Math.max(r[i-1]+arr[i],f[i-1]);//要么是加上当前元素，也就是维持之前删除某个元素的情形，即r[i-1]+arr[i]
//要么是删除当前这个元素，那么区间[0, i-1]就是不删除元素的情况，即f(i-1)+0
          res=Math.max(res,Math.max(f[i],r[i]));
      }
      return res;
    }

    public static void main(String[] args) {
        int []arr = {1,-2,0,3};
        System.out.println(maximumSum(arr));
    }
}
