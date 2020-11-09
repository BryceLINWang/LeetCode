package phoenix.每日一题;

import java.util.Arrays;
import java.util.Comparator;

public class 最接近的k个点 {
    public int[][] kClosest(int[][] points, int K) {
      Arrays.sort(points, new Comparator<int[]>() {
          @Override
          public int compare(int[] point1, int[] point2) {
              return (point1[0]*point1[0]+point1[1]*point1[1])-(point2[0]*point2[0]+point2[1]*point2[1]);
          }
      } );
      return Arrays.copyOfRange(points,0,K);
    }
}
