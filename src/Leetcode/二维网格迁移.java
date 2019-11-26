package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 二维网格迁移 {
    public static List<List<Integer>> shiftGrid(int[][] grid, int k){
        int n=grid.length;
        int m=grid[0].length;
        while(k-->0) {
            int[] tmp = new int[n];
            for (int i = 0; i < n; i++)
                tmp[i] = grid[i][0];
            int a = grid[n - 1][m - 1];
            for (int i = n - 1; i >= 1; i--)
                grid[i][0] = grid[i - 1][m - 1];
            grid[0][0] = a;
            for (int i = 0; i < n; i++) {
                for (int j = m - 1; j >= 1; j--) {
                    if (j == 1) grid[i][j] = tmp[i];
                    else grid[i][j] = grid[i][j - 1];
                }
            }
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0;j<m;j++){
                list.add(grid[i][j]);
            }
            result.add(list);
        }
        return result;
    }
    public static void main(String[] args) {
     int k=1;
     int [][]grid={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(shiftGrid(grid,k));
    }
}
