package imp;

import java.util.ArrayList;
import java.util.List;

public class 组合 {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res=new ArrayList<>();
        backres(res,n,k,1,new ArrayList<>());
        return res;
    }
    public static void backres( List<List<Integer>>res,int n,int k,int num,List<Integer>list){
        if(list.size()==k){
            res.add(new ArrayList<>(list));
        }else{
            for(int i=num;i<=n;i++){
                list.add(i);
                backres(res,n,k,i+1,list);
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
     int n=4,k=2;
        System.out.println(combine(n,k));
    }
}
