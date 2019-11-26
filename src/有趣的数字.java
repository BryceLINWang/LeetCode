import java.util.*;

public class 有趣的数字 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int maxNum=0;
        int e=1,f=1,m1=0,m2=n-1;
        while (a[m2]==a[m2-1]){
            e++;
            --m2;
        }
        while (a[m1] == a[m1 + 1]) {
            ++f;
            ++m1;
        }
        maxNum=e*f;
        int minNum=0;
        int mintmp=a[n-1];
        for(int i=1;i<n;++i){
            if(mintmp>a[i]-a[i-1]){
                mintmp=a[i]-a[i-1];
            }
        }
        if (mintmp>0){
            for (int i=1;i<n;++i){
                if(mintmp==a[i]-a[i-1]){
                    minNum++;
                }
            }
        }else {
            for (int i=1;i<n;i++){
                int j=i-1;
                while(a[j]==a[i]&&j>=0){
                    minNum++;
                    --j;
                }
            }
        }
        System.out.println(minNum+" "+maxNum);
    }
}
