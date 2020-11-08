package Demo;

public class 一个数 {
    public static int countBit (int n) {
        // write code here
        int tmp=n;
        int res=0;
        while(tmp>=1){
            if(tmp%2==1){
                res+=1;
            }
            tmp/=2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countBit(15));
    }
}
