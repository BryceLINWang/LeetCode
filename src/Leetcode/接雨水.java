package Leetcode;

public class 接雨水 {
    public static int trap(int[] height) {
    int sum=0;
    int []maxleft=new int[height.length];
    int []maxright=new int[height.length];
   for (int i=1;i<=height.length-1;i++){
     maxleft[i]=Math.max(maxleft[i-1],height[i-1]);
   }
   for(int i=height.length-2;i>=0;i--){
    maxright[i]=Math.max(maxright[i+1],height[i+1]);
   }
   for(int i=1;i<height.length-1;i++){
   int min=Math.min(maxleft[i],maxright[i]);
   if (min>height[i]){
    sum=sum+(min-height[i]);
   }
   }
   return sum;
    }

    public static void main(String[] args) {
    int []a={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(a));
    }
}
