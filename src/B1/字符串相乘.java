package B1;

public class 字符串相乘 {
    public String multiply(String num1, String num2) {
        if(num1.length()==0||num2.length()==0)return "";
        int []ans=new int[num1.length()+num2.length()];
        for(int i=num1.length()-1;i>=0;i--){
            for(int j=num2.length()-1;j>=0;j--){
                char a=num1.charAt(i);
                char b=num2.charAt(j);
                int num=(a-'0')*(b-'0');
                num+=ans[i+j+1];
                ans[i+j]+=num/10;
                ans[i+j+1]=num%10;
            }
        }
        int index=0;//去前导0
        while(index<ans.length-1&&ans[index]==0)index++;
        StringBuilder sb=new StringBuilder();
        for(;index<ans.length;index++){
            sb.append(ans[index]);
        }
        return sb.toString();
    }
}
