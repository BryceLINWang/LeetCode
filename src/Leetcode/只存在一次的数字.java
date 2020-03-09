package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class 只存在一次的数字 {
    public static int singleNumber(int[] nums) {
     int res=0;
     for(int tmp:nums){
         res^=tmp;//利用异或计算的性质 两数相同异或得0 0与其他数异或为它本身 XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     }
     return res;
    }
    public static int singleNumber1(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){

            if(!set.add(i)){//先add再判断？
                set.remove(i);
            }
        }
        return set.isEmpty()?0:set.iterator().next();//遍历返回仅剩的值
    }

    public static void main(String[] args) {
   int nums[]={4,1,2,1,2};
        System.out.println(singleNumber1(nums));

    }
}
