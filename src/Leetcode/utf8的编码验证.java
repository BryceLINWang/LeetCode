package Leetcode;

public class utf8的编码验证 {
    public static boolean validUtf8(int[] data) {
     int num=0;//当前utf-8字符字节数
     for(int i=0;i<data.length;i++){
         String utarr=Integer.toBinaryString(data[i]);
         //若整数非常大，取最高8比特
         utarr=utarr.length()>=8
                 ?utarr.substring(utarr.length()-8)
                 :"00000000".substring(utarr.length()%8)+utarr;
         if (num==0){
             for (int j=0;j<utarr.length();j++){
                 if (utarr.charAt(j)=='0'){
                     break;
                 }
                 num+=1;
             }
             if (num==0){
                 continue;
             }
             if (num>4||num==1){
                 return false;
             }
         }else {
             if (!(utarr.charAt(0)=='1'&&utarr.charAt(1)=='0')){
                 return false;
             }
         }
         num-=1;
     }
     return num==0;
    }

    public static void main(String[] args) {
        int []data={197,130,1};
        int []data1={235,140,4};
        System.out.println(validUtf8(data1));
    }
}
