package B1;

public class 负二进制转换 {
    public  static String baseNeg2(int N) {
        if(N==0)return "0";
        StringBuilder res=new StringBuilder();

        while (N!=0){
           int r=N%-2;
           if(r==-1){
               res.append(1);
           }else {
               res.append(r);
           }
           if(r==-1){
               N/=-2;
               N++;
               continue;
           }
           N/=-2;
        }
        return res.reverse().toString();
    }

    public static void main(String[] args) {
        int N=6;
        System.out.println(baseNeg2(N));
    }
}
