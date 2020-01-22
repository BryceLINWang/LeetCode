package Leetcode;

public class 朋友圈{
class UnionFindSet {
    int[] arr;
    int size;

    public UnionFindSet(int size) {
        this.arr = new int[size];
        for (int i = 0; i<size; i++){
            arr[i] = -1;
        }
        this.size = size;
    }
    //寻找父节点，没有就返回自己
    public int find(int x){
        while (arr[x] >= 0){
            x = arr[x];
        }
        return x;
    }
    public boolean isInSameSet(int a, int b){
        return find(a) == find(b);
    }
    //合并的时候先找根节点
    public void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);
        arr[rootA] += arr[rootB];
        arr[rootB] = rootA;
    }
    public int getSize(){
        int count = 0;
        for (int i : arr){
            if (i < 0){
                count++;
            }
        }
        return count;
    }
}

    public static int findCircleNum(int[][] M) {
return 0;
    }

    public static void main(String[] args) {

    }
}
