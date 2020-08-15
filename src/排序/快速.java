package 排序;

public class 快速 {
    public static void main(String[] args) {
        int[] arr={9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] a){

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
