package 排序;

public class 冒泡 {
    //n^2
    //稳
    public static void main(String[] args) {
        int[] arr={5,3,6,8,1,7,9,4,2};
        sort(arr);
        print(arr);
    }
    static void sort(int[] a){
        for (int i=a.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if (a[j]>a[j+1])swap(a,j,j+1);
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
