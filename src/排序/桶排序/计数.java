package 排序.桶排序;

import java.util.Arrays;

//量大而范围小
//时间O（n+k）

public class 计数 {
    public static void main(String[] args) {
        int []arr={2,4,2,3,7,1,1,0,0,5,6,9,8,5,7,4,0,9};
        int []result=sort(arr);
        System.out.println(Arrays.toString(result));
    }
    static int[] sort(int[] arr){
        int []result=new int[arr.length];
        int []count=new int[10];//取值范围
        for(int num:arr){
            count[num]++;
        }
        System.out.println(Arrays.toString(count));
//        for (int i=0,j=0;i<count.length;i++){
//            while (count[i]-->0)result[j++]=i;
//        }
        for (int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1];//累加数组
        }
        System.out.println(Arrays.toString(count));
        for(int i=arr.length-1;i>=0;i--){
            result[--count[arr[i]]]=arr[i];//为稳定性修改 累加数组确定位置 自减按照相应位置存放
        }
       return result;
    }
    static void findMax(int []a,int n){
       for(int j=0;j<n;j++){
           if(a[j]>a[j+1])swap(a,j,j+1);
       }
    }
    static void swap(int[] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
