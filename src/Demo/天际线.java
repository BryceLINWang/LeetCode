package Demo;

import java.util.*;

public class 天际线 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //建筑物个数
        int n = Integer.parseInt(sc.nextLine());
        int[][] buildings = new int[n][3];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] arr = s.split(" ");
            for (int j = 0; j < arr.length; j++) {
                buildings[i][j] = Integer.parseInt(arr[j]);
            }
        }

        //获取天际线，待实现
       // List<List<Integer>> skyline = getSkyline(buildings);

        //输出skyline到标准输出
//        for (List<Integer> point : skyline) {
//            int size = point.size();
//            for (int i = 0; i < size; i++) {
//                System.out.print(point.get(i));
//                if (i < size-1) {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
   //     }
    }
//    public static List<List<Integer>> getSkyline(int[][] buildings) {
//        //todo 实现算法
//
//    }

}
