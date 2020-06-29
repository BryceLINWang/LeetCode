package B1;

public class 整数反转 {
    public int reverse(int x) {
        // if(x==0)return 0;
        // String str=String.valueOf(x);
        // boolean flag=false;
        // if(x<0){
        //     str=str.substring(1);
        //     flag=true;
        // }
        // char[]chars=str.toCharArray();

        // for(int left=0,right=str.length()-1;left<right;left++,right--){
        //   char tmp=chars[right];
        //   chars[right]=chars[left];
        //     chars[left]=tmp;
        // }
        // str=String.valueOf(chars);
        // if(str.charAt(0)=='0'){
        //    str=str.substring(1);
        // }

        // return flag==true?-Integer.valueOf(str):Integer.valueOf(str);
      int temp=0;
      while(x!=0){
         int pop=x%10;
         x/=10;
         if(temp>Integer.MAX_VALUE/10||temp==Integer.MAX_VALUE/10&&pop>7){
             return 0;
         }
          if(temp<Integer.MIN_VALUE/10||temp==Integer.MIN_VALUE/10&&pop<-8){
              return 0;
          }
         temp=temp*10+pop;
      }
      return temp;
    }
}
