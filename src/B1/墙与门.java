package B1;

import java.util.LinkedList;
import java.util.Queue;

public class 墙与门 {
    int [][]STEP_ARRAY={{0,1},{0,-1},{1,0},{-1,0}};
    class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public void wallsAndGates(int[][] rooms) {
        int row=rooms.length;
        if(row ==0){
            return;
        }
        int col=rooms[0].length;
        //找门
        Queue<Point>queue=new LinkedList<>();
        for (int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(rooms[i][j]==0){
                    ((LinkedList<Point>) queue).add(new Point(i,j));
                }
            }
        }
        while (!queue.isEmpty()){
            Point point=queue.poll();
            int x=point.x;
            int y=point.y;
            for(int []step:STEP_ARRAY){
                int pointX=step[0]+x;
                int pointY=step[1]+y;
                if(pointX<0||pointX>=row||pointY<0||pointY>=col||rooms[pointX][pointY]!=Integer.MAX_VALUE){
                    continue;
                }
                rooms[pointX][pointY]=rooms[x][y]+1;
                ((LinkedList<Point>) queue).add(new Point(pointX,pointY));
            }
        }
    }
}
