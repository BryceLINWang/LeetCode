package B1;

import java.util.ArrayList;
import java.util.List;

public class 删除注释 {
    public List<String> removeComments(String[] source) {
        List<String>res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        Boolean inblock=false;
        for(String line:source){
            int i=0;
            char[]chars=line.toCharArray();
            if (!inblock)sb=new StringBuilder();
            while(i<line.length()){
                if(!inblock&&i+1<line.length()&&chars[i]=='/'&&chars[i+1]=='*'){
                    inblock=true;
                    i++;
                }else if(inblock&&i+1<line.length()&&chars[i]=='*'&&chars[i+1]=='/'){
                    inblock=false;
                    i++;
                }else if(!inblock&&i+1<line.length()&&chars[i]=='/'&&chars[i+1]=='/'){
                    break;
                }else if(!inblock){
                    sb.append(chars[i]);
                }
                i++;
            }
            if(!inblock&&sb.length()>0){
                res.add(new String(sb));
            }

        }
        return res;
    }
}
