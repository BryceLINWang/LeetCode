package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 合并区间 {
    public static int[][] merge(int[][] intervals) {
    List<int[]> res = new ArrayList<>();
    if (intervals == null || intervals.length == 0)
        return res.toArray(new int[0][]);//list转化为你所需要类型的数组

    // Arrays.sort(intervals,Comparator<>);实现自定义比较// a[0] - b[0]大于0就交换顺序
    // 根据二维数组第一个数字大小按每一行整体排序
    Arrays.sort(intervals, new Comparator<int[]>() {
        public int compare(int[] o1, int[] o2) {
            return o1[0] - o2[0];
        }
    });
    int i = 0;
    while (i < intervals.length) {
        int left = intervals[i][0];
        int right = intervals[i][1];
        // i不能到最后一行,所以要小于(数组的长度 - 1)
        // 判断所在行的right和下一行的left大小,对right重新进行赋最大值,之后再不断进行while循环判断
        while (i < intervals.length - 1 && right >= intervals[i + 1][0]) {
            i++;
            right = Math.max(right, intervals[i][1]);
        }
        res.add(new int[] { left, right });
        i++;


    }
    return res.toArray(new int[0][]);
}
    public static void main(String[] args) {
        int [][]a={{1,3},{2,6},{8,10},{15,18}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(Arrays.deepToString(merge(a)));
        System.out.println(Arrays.deepToString(a));
    }

    
}
