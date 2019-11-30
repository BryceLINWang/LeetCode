package Leetcode;



import java.util.ArrayList;
import java.util.List;

public class 可被三整除的最大和 {
    public static int maxSumDivThree(int []nums){
        List<Integer>list =new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        list.sort(Integer::compareTo);
        List<Integer>list0 =new ArrayList<>();
        List<Integer>list1 =new ArrayList<>();
        List<Integer>list2 =new ArrayList<>();
        int sum=0;
        for(int i=0;i<list.size();i++){
            int x=list.get(i);
            sum+=x;
            if (x%3==0){
                list0.add(x);
            }else if (x%3==1){
                list1.add(x);
            }else {
                list2.add(x);
            }
        }
        int sum1=Integer.MAX_VALUE;
        int sum2=Integer.MAX_VALUE;
        if(sum%3==1){
            if(list1.size()>=1){
                sum1=list1.get(0);
            }
            if (list2.size()>=2){
                sum2=list2.get(0)+list2.get(1);
            }
            if(sum1!=Integer.MAX_VALUE||sum2!=Integer.MAX_VALUE){
                sum -=(sum1<sum2?sum1:sum2);
            }else{
                sum=0;
            }
        }else if(sum%3==2){
            if(list1.size()>=2){
                sum1=list1.get(0)+list1.get(1);
            }
            if (list2.size()>=1){
                sum2=list2.get(0);
            }
            if(sum1!=Integer.MAX_VALUE||sum2!=Integer.MAX_VALUE){
                sum -=(sum1<sum2?sum1:sum2);
            }else{
                sum=0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int []nums={3,6,5,8,1};
        System.out.println(maxSumDivThree(nums));
    }
}
