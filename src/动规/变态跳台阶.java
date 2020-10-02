package 动规;

public class 变态跳台阶 {
    public static int jump(int n){
        if(n<0){
            return -1;
        }else if (n==1||n==0){
            return n;
        }else {
            return 2*jump(n-1);
        }
    }
}
