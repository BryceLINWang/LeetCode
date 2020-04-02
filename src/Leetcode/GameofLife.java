package Leetcode;

public class GameofLife {
    public void gameOfLife(int[][] board) {
       int []neighbors={0,-1,1};
       int row=board.length;
       int col=board[0].length;
       int [][]copyBoard=new int[row][col];
       for(int i=0;i<row;i++){
           for (int j=0;j<col;j++){
               copyBoard[i][j]=board[i][j];
           }
       }
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                //统计活细胞数
              int num=0;
              //周围8个位置
                for(int ii=0;ii<3;ii++){
                    for (int jj=0;jj<3;jj++){
                        if(!(neighbors[ii]==0&&neighbors[jj]==0)){
                            int r=(i+neighbors[ii]);
                            int c=(j+neighbors[jj]);
                            if((r<row&&r>=0)&&(c<col&&c>=0)&&(copyBoard[r][c]==1)){
                                num+=1;
                            }
                        }
                    }
                }
                if ((copyBoard[i][j]==1)&&(num<2||num>3)){
                    board[i][j]=0;
                }
                if((copyBoard[i][j]==0)&&num==3){
                    board[i][j]=1;
                }
            }
        }
    }
}
