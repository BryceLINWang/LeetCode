package Leetcode;

public class 矩形重叠 {
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return!(rec1[2]<=rec2[0]|| //left
                rec1[0]>=rec2[2]|| //right
                rec1[1]>=rec2[3]|| //top
                rec1[3]<rec2[1]//bottom
                );
    }

    public static void main(String[] args) {
        int []rec1={0,0,2,2};
        int []rec2={1,1,3,3};
        int []rec3={0,0,1,1};
        int []rec4={1,0,2,1};
        System.out.println(isRectangleOverlap(rec1,rec2));
        System.out.println(isRectangleOverlap(rec3,rec4));

    }
}
