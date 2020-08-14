package 排序;

/**
 * O(n^2)
 * 1
 * 不稳
 */
public class 选择 {
    public static void swap(int a,int b){
        int tmp=a;
        a=b;
        b=tmp;
    }
    public static void main(String[] args) {
    int[] arr={5,3,6,8,1,7,9,4,2};

    for (int i=0;i<arr.length-1;i++) {
      int  minPos=i;
        for (int j = i+1; j < arr.length; j++) {
           minPos=arr[j]<arr[minPos]?j:minPos;
        }
        int tmp=arr[i];
        arr[i]=arr[minPos];
        arr[minPos]=tmp;
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    }
}
