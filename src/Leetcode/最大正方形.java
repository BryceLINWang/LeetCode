package Leetcode;

public class 最大正方形 {
    public int maximalSquare(char[][] matrix) {
     if(matrix==null||matrix.length==0||matrix[0].length==0){
        return 0;
     }
     int height=matrix.length;
     int width=matrix[0].length;
     int maxvalue=0;
     int [][]dp=new int[height+1][width+1];
     for(int row=0;row<height;row++){
         for(int col=0;col<width;col++){
             if(matrix[row][col]=='1'){

             }
         }
     }
     return maxvalue*maxvalue;
    }

    public static void main(String[] args) {

    }
}
