package phoenix.动规;

public class 接雨水 {
    public int trap(int[] height) {
       int water=0;
        //用数组存放每列左边最高墙 右边最高墙
        //两者中短的那个减去当前列高度就是当前列水多少

        int []leftMax=new int[height.length];
        int []rightMax=new int[height.length];
        for(int i=1;i<height.length-1;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i-1]);
        }
        for(int i=height.length-2;i>=0;i--){
           rightMax[i]=Math.max(rightMax[i+1],height[i+1]);
        }
        for(int i=1;i<height.length-1;i++){
            int min=Math.min(leftMax[i],rightMax[i]);
            if(min>height[i]){
                water+=min-height[i];
            }
        }
        return water;
    }
}
