package B1;

public class 统计全1子矩形 {
    public int numSubmat(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        int[][] row = new int[n][m];
        //初始化方便横向收集
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (j == 0) {
                    row[i][j] = mat[i][j];
                } else if (mat[i][j] != 0) {
                    row[i][j] = row[i][j - 1] + 1;
                } else {
                    row[i][j] = 0;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                int col=row[i][j];
                for(int k=i;k>=0&&col!=0;k--){
                   col=Math.min(col,row[k][j]);
                   ans+=col;
                }
            }
        }
        return ans;
    }
}
