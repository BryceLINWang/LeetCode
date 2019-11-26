package Leetcode;

public class 鸡蛋掉落 {
    public static int superEggDrop(int K, int N) {
     int count=1;
     while(getcounts(count,K)<N){
      ++count;
     }
     return count;
    }

    /**
     * 可确定的楼层
     * @param count 移动次数
     * @param egg 鸡蛋数
     * @return
     */
    public static int getcounts(int count,int egg){
   if(count==1||egg==1){
       return count;
   }
   return getcounts(count-1,egg)+1+getcounts(count-1,egg-1);
    }

    public static void main(String[] args) {
        System.out.println(superEggDrop(1,2));
        System.out.println(superEggDrop(2,6));
        System.out.println(superEggDrop(3,14));
    }
 }
