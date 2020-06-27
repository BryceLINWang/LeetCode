package B1;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 你被给定一个 m × n 的二维网格，网格中有以下三种可能的初始化值：
 *
 * -1 表示墙或是障碍物
 * 0 表示一扇门
 * INF 无限表示一个空的房间。然后，我们用 231 - 1 = 2147483647 代表 INF。你可以认为通往门的距离总是小于 2147483647 的。
 * 你要给每个空房间位上填上该房间到 最近 门的距离，如果无法到达门，则填 INF 即可。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/walls-and-gates
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
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
