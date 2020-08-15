package 排序;

public class ShellSort {
    //希尔
    public static void main(String[] args) {
        int[] arr={9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] a){
        for (int gap=a.length/2;gap>0;gap/=2) {
            for (int i = gap; i < a.length; i++) {
                for (int j = i; j > gap - 1; j -= gap) {
                    if (a[j] < a[j - gap]) {
                        swap(a, j, j - gap);
                    }
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
