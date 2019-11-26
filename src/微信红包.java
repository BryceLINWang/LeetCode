import java.util.Arrays;
import java.util.Scanner;

public class 微信红包 {
    public static int getRes(int a[],int n){
        if(n==0||a==null){
            return 0;
        }
        Arrays.sort(a);
        int result=0;
        for(int i=0;i<n;i++){
            result=a[i];
            int count=0;
            for(int j=i;j<n;j++){
                if (a[j]==result){
                    count++;
                }else {
                    break;
                }
            }
            if (count*2<=n){
                result=0;
                continue;
            }else {
                return result;
            }
        }
         return result;
    }
    public static void main(String[] args) {
        int []a={1,2,3,2,2};
        int n=5;
        System.out.println(getRes(a,n));
    }
}
