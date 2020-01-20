package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class 最长连续序列 {
    public static int longestConsecutive(int[] nums) {
    if(nums==null||nums.length==0){//判断边界条件
        return 0;
    }
    //key对应数组的值，value对应每个nums[i]的序列个数
        Map<Integer,Integer>map=new HashMap<>();
    for(int i=0;i<nums.length;i++){
     if(!map.containsKey(nums[i])){//若没有保存该元素
         map.put(nums[i],1);//初始化认为序列长度1
         int tmp=nums[i];//检测大的
         boolean flag=false;
         if(map.containsKey(tmp+1)){//检测相邻元素并更新
             while (map.containsKey(tmp+1)){
                 tmp++;
             }
             map.put(tmp,map.get(tmp)+1);//更新本序列最大元素的value
             map.put(nums[i],map.get(tmp));//更新当前元素value保证一个序列最大最小数value一致
             flag=true;
         }
         int tmp2=nums[i];//检测小的
         int count=0;
         if(map.containsKey(tmp2-1)){
             //检测相邻元素并更新
             while (map.containsKey(tmp2-1)){
                 tmp2--;
                 count++;
             }
             if(flag){//存在比当前大的元素也存在比当前小的元素
                 map.put(tmp,map.get(tmp)+count);//更新该序列最大元素value
                 map.put(tmp2,map.get(tmp));//保证一个序列最大最小数value一致
             }else{//只存在比当前小的元素
                 map.put(tmp2,map.get(tmp2)+1);//更新该序列最小元素value
                 map.put(nums[i],map.get(tmp2));//保证一个序列最大最小数value一致
             }
         }
     }
     }
     int max=0;
    for (Integer key:map.keySet()){
        if(max<map.get(key)){
            max=map.get(key);
        }
    }
    return max;
    }
    public static void main(String[] args) {
    int []nums={1,3,5,2,4};
        System.out.println(longestConsecutive(nums));
    }
}
