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
    int minPos=0;
    for(int j=1;j<arr.length;j++){
        if(arr[j]<arr[minPos]){

        }
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+" ");
    }
    }
}
