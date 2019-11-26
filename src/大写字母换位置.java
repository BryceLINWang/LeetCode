import java.util.Arrays;
import java.util.Scanner;

public class 大写字母换位置 {
    public static boolean isbig(char c){
        if(c>='A'&&c<='Z')
            return true;
        else
            return false;
    }
    public static void swap(char a[],int e , int f) {
        char temp;
        temp = a[e];
        a[e] = a[f];
        a[f]= temp;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char []a=str.toCharArray();
        int len=a.length;
        int end=len;
        for (int i=0;i<end;++i){
            if(isbig(a[i])){
                int j=i;
                for (;j<len-1;++j)
                     swap(a,j,j+1);
                    --end;
                    --i;

            }
        }
        StringBuffer sb=new StringBuffer();
        String str1=null;
        for (int i=0;i<a.length;i++){
            str1=sb.append(a[i]).toString();
        }
        System.out.print(str1);
    }

}
