package 排序;

import java.util.Arrays;

public class 基数 {
    public static void main(String[] args) {
        int []arr={421,240,115,532,305,430,124};
        //先求最高位数
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            max=arr[i]>arr[i-1]?arr[i]:max;
        }
        int maxlen=String.valueOf(max).length();
        int []result=sort(arr,maxlen);

        System.out.println(Arrays.toString(result));
    }
    public static int[] sort(int[] arr,int maxlen){
        int []result=new int[arr.length];
        int []count=new int[10];
        for(int i=0;i<maxlen;i++){
            int division=(int)Math.pow(10,i);
            System.out.println(division);
            for(int j=0;j<arr.length;j++){
              int num=arr[j]/division%10;
                System.out.print(num+" ");
                count[num]++;
            }
            System.out.println();
            System.out.println(Arrays.toString(count));
            for (int m=1;m<count.length;m++){
                count[m]=count[m]+count[m-1];//累加数组
            }
            System.out.println(Arrays.toString(count));
            for(int n=arr.length-1;n>=1;n--){
                int num=arr[n]/division%10;
                result[--count[num]]=arr[n];
            }
            System.arraycopy(result,0,arr,0,arr.length);
            Arrays.fill(count,0);
        }

        return result;
    }

}
