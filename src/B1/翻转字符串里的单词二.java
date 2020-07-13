package B1;

public class 翻转字符串里的单词二 {
    public void reverseWords(char[] s) {
        if(s.length==0){
            return ;
        }
        char []ans=new char[s.length];
        int count=0,j=0;//count记单词字母数，j新数组索引
        for(int i=s.length-1;i>=0;i--){
            if(s[i]==' '){
                int k=i+1;
                if(count>0){
                    while(--count>=0){
                        ans[j++]=s[k++];
                    }
                    ans[j++]=' ';
                    count=0;
                }
            }else if(i==0){
                for(;i<=count;i++)ans[j++]=s[i];
                j+=1;
                break;
            }else{
                count++;
            }
        }
        for(int i=0;i<ans.length;i++){
            s[i]=ans[i];
        }
    }
}
