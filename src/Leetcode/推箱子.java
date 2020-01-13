package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class 推箱子 {
    /**
     * 推箱子是一种风靡全球的益智小游戏，玩家需要将箱子推到仓库的目标位置。
     * 游戏地图用大小为n*m的网格grid表示，其中每个元素可以是墙，地板或者是箱子
     * 现在你将作为玩家参与游戏，按照规则将箱子‘B’移动到目标位置‘T’
     * 玩家将字符‘S’表示，只要他在地板上，就可以在网格中向上，下，左，右四个方向移动
     * 地板用字符‘.’，意味着可以自由行走
     * 墙用字符‘#’，意味者障碍物，不能行走。
     * 箱子仅有一个，用字符‘B’表示。相应地，网格上有一个目标位置‘T’
     * 玩家需要站在箱子旁边，然后沿着箱子的方向，进行移动，此时箱子会被移动到相邻的地板单元格。记作一次推动。
     * 玩家无法越过箱子。
     * 返回将箱子推到目标位置的最小推动次数，如果无法做到，返回-1.
     */
    int[] sha = {-1, 1, 0, 0};
    int[] xia = {0, 0, -1, 1};
    int[] zuo = {1, -1, 0, 0};
    int[] you = {0, 0, 1, -1};

    class Point {
        int ss, xx;
        int zz, yy;
        int step;

        public Point(int ss, int xx, int zz, int yy, int step) {
            this.ss = ss;
            this.xx = xx;
            this.zz = zz;
            this.yy = yy;
            this.step = step;
        }
    }

    class Person {
        int zz;
        int yy;

        public Person(int zz, int yy) {
            this.zz = zz;
            this.yy = yy;
        }

    }

    Point pos;
    int ans;

    public boolean bfsp(char[][] grid, int n, int m, int zz, int yy, int targetx, int targety, int ss, int xx) {
        boolean[][] flag = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                flag[i][j] = false;
            }
        }
        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person(zz, yy));
        flag[zz][yy] = true;
        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            if (tmp.zz == targetx && tmp.yy == targety) return true;
            if (tmp.zz == ss && tmp.yy == xx) continue;
            for (int i = 0; i < 4; i++) {

            }
        }
            return false;
        }




    public static void main(String[] args) {

    }
}

