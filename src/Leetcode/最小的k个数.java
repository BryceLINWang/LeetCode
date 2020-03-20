package Leetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class 最小的k个数 {
    public static int[] getLeastNumbers1(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        // Java 的 PriorityQueue 默认是小顶堆，添加 comparator 参数使其变成最大堆
        Queue<Integer>heap=new PriorityQueue<>(k,(i1,i2)->Integer.compare(i2,i1));
        for(int a:arr){
            // 当前数字小于堆顶元素才会入堆
            if (heap.isEmpty()||heap.size()<k||a<heap.peek()){
                heap.offer(a);
            }
            if (heap.size()>k){
                heap.poll();
            }
        }

        int []res=new int[heap.size()];
        int j=0;
        for (int a:heap){
            res[j++]=a;
        }
        return res;
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }else if(arr.length<=k){
            return arr;
        }
        //划分数组
        partitionArray(arr, 0, arr.length - 1, k);
        int []res=new int[k];
        for (int i=0;i<k;i++){
            res[i]=arr[i];
        }
        return res;
    }
    public void partitionArray(int []arr,int lo,int hi,int k){
        int m = partition(arr, lo, hi);
        // 此时数组前 m 个数，就是最小的 m 个数
        if (k == m) {
            // 正好找到最小的 k(m) 个数
            return;
        } else if (k < m) {
            // 最小的 k 个数一定在前 m 个数中，递归划分
            partitionArray(arr, lo, m-1, k);
        } else {
            // 在右侧数组中寻找最小的 k-m 个数
            partitionArray(arr, m+1, hi, k);
        }
    }

    private int partition(int[] arr, int lo, int hi) {
        int i=lo,j=hi+1,v=arr[lo];
        while (true){
           while (arr[++i]<v){
               if (i==hi){
                   break;
               }
           }
           while (arr[--j]>v){
               if (j==lo){
                   break;
               }
           }
           if (i>=j){
               break;
           }
           swap(arr,i,j);
        }
        swap(arr,lo,j);
        return j;
    }
    public void swap(int []arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

    public static void main(String[] args) {
        int []arr={0,3,2,1,4,5};
        int []arr1={0,3,2,1,4,5};
        int k=3;
        最小的k个数 aaa=new 最小的k个数();
        System.out.println(aaa.getLeastNumbers(arr1,k));
        System.out.println(getLeastNumbers1(arr,k));
    }
}
