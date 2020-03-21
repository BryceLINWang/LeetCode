package Leetcode;

public class waterandjugproblem {

    public static boolean canMeasureWater(int x, int y, int z) {
        if (x + y < z) return false;
        if (x == 0 || y == 0) return z == 0 || x + y == z;
        return z % gcd(x, y) == 0;
    }
    public static int gcd(int a,int b){
        while (b!=0){
            int tmp=a%b;
            a=b;
            b=tmp;
        }
        return a;
    }
    public static void main(String[] args) {
     int x=3,y=5,z=4;
     int x1=2,y1=6,z1=5;
        System.out.println(canMeasureWater(3,5,4));
        System.out.println(canMeasureWater(2,6,5));
        System.out.println(gcd(2,6));
    }
}
