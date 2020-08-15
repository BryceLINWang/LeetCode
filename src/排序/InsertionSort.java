package 排序;

public class InsertionSort {
    //n^2
    //插入
    public static void main(String[] args) {
        int[] arr={5,3,6,8,1,7,9,4,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] a){
     for(int i=1;i<a.length;i++){
         for(int j=i;j>0;j--){
             if(a[j]<a[j-1]){
                 swap(a,j,j-1);
             }
         }
     }
    }
    static void swap(int[] a,int i,int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
    static void print(int[] a){
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
