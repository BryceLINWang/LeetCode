package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 三元组 {

    public static void helper(int []arr,List<List<Integer>>list,List<Integer>tmp,boolean []booleans){
        if(tmp.size()==3){
            list.add(new ArrayList<>(tmp));
            return;
        }
        for(int i=0;i<arr.length;i++){
           if(!booleans[i]){
               if(tmp.size()==0||(tmp.size()>0&&arr[i]>=tmp.get(tmp.size()-1))){
                   tmp.add(arr[i]);
               }
               booleans[i]=true;
               helper(arr,list,tmp,booleans);
               booleans[i]=false;
               if(tmp.contains(arr[i])){
                   tmp.remove(arr[i]);
               }
           }
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        List<List<Integer>>list =new ArrayList<>();
        List<Integer>tmp =new ArrayList<>();
        boolean []booleans=new boolean[n];
        helper(arr,list,tmp,booleans);
        System.out.println(list.size());
    }
}
