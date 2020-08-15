package 排序;

public class 归并排序 {
    public static void main(String[] args) {
        int[] arr={9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        sort(arr,0,arr.length-1);
        print(arr);
    }
    static void sort(int[] a,int left,int right){
        if(left==right)return;
       int mid=left+(right-left)/2;
       if (left<right){
       sort(a, left,mid);
       sort(a,mid+1,right);
       merge(a,left,right,mid);
       }
    }
    static void merge(int[] arr, int low,int high,int mid){

        int []temp=new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
        while (i<=mid&&j<=high){
            if(arr[i]<=arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
            }
        }
        while (i<=mid){
            temp[k++]=arr[i++];
        }
        while (j<=high){
            temp[k++]=arr[j++];
        }
        for (int x=0;x<temp.length;x++){
            arr[x+low]=temp[x];
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
