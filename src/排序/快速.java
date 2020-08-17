package 排序;

public class 快速 {
    public static void main(String[] args) {
        int[] arr={9,6,11,3,5,12,8,7,10,15,14,4,1,13,2};
        sort(arr,0,arr.length-1);
        print(arr);
    }
    static void sort(int[] a,int leftBound,int rightBound){
     if (leftBound>=rightBound)return;
     int mid=partition(a,leftBound,rightBound);
     sort(a,leftBound,mid-1);
     sort(a,mid+1,rightBound);
    }
    static int partition(int[] a,int leftBound,int rightBound){
      int pivot=a[rightBound];
      int left=leftBound;
      int right=rightBound-1;

      while(left<=right){
          while (left<=right&&a[left]<=pivot)left++;
          while (left<=right&&a[right]>pivot)right--;
          //System.out.println("before swap:"+left+" "+right);
          if (left<right)swap(a,left,right);
          //print(a);
      }
      swap(a,left,rightBound);
      return left;
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
