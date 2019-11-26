import java.util.HashMap;
import java.util.Map;

public class 微信红包2 {
    public static int getRes(int a[],int n){
        Map<Integer,Integer>map=new HashMap<>();
        for (int i=0;i<n;i++){
            int tmp=a[i];
            int count =map.getOrDefault(tmp,0);
            map.put(tmp,count+1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)*2>n){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int []a={1,2,3,2,2};
        int n=5;
        System.out.println(getRes(a,n));
    }
}
