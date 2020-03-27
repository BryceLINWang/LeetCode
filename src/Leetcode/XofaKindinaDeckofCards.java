package Leetcode;

public class XofaKindinaDeckofCards {
    public static boolean hasGroupsSizeX(int[] deck) {
        //计数
        int []counter=new int[10000];
        for(int num:deck){
           counter[num]++;
        }
        int x=0;
        for(int num:counter){
            if(num>0){
                x=gcd(x,num);
                if (x==1){
                    return false;
                }
            }
        }
        return x>=2;
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        int []a={1,1,1,2,2,2,3,3};
        int []b={1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(a));
        System.out.println(hasGroupsSizeX(b));
    }
}
