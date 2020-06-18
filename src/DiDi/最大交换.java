package DiDi;

public class 最大交换 {
    public static int maximumSwap(int num) {
        //转化为字符数组
        char[]chars =Integer.toString(num).toCharArray();
        int []last=new int[10];
        //位置标记存入数组
        for (int i=0;i<chars.length;i++){
            last[chars[i]-'0']=i;
        }
        for(int i=0;i<chars.length;i++){
            //大于该位置数范围内遍历
         for(int j=9;j>chars[i]-'0';j--){
            if(last[j]>i){
                //交换
                char tmp=chars[last[j]];
                chars[last[j]]=chars[i];
                chars[i]=tmp;
                return Integer.valueOf(new String(chars));
            }
         }
        }
        return num;
    }

    public static void main(String[] args) {
        int num=2736;
        System.out.println(maximumSwap(num));
    }
}
