package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class 分割回文串 {
    List results;
    public List<List<String>> partition(String s) {
        results = new ArrayList<ArrayList<String>>();
        boolean[] cut = new boolean[s.length()];
        find(s,0,cut);
        return results;
    }

    private void find(String s,int index,boolean[] cut){

        if(index == s.length()){
            List<String> temp = new ArrayList<String>();
            int begin = 0,last = 0;
            while(last < s.length()){
                if(cut[last]){
                    temp.add(s.substring(begin,last+1));
                    begin = last+1;
                }
                last++;
            }
            results.add(temp);

        }

        for(int i=index;i<s.length();i++){
            if(isPalindrome(s)){
                cut[i] = true;

                find(s,i+1,cut);
                cut[i]=false;

            }
        }
    }


    //判断是否为回文字符串
    public static boolean isPalindrome(String s) {
        if(s.length()==0||s.length()==1){return true;}
        int i=0,j=s.length()-1;
        while (i<j){
            char l=s.charAt(i);
            char r=s.charAt(j);
            if (l>= 'A' && l <= 'Z') {
                l+= ' ';
            }else if(!(l >= 'a' && l <= 'z' || l >= '0' && l <= '9')){
                i++;
                continue;
            }
            if (r>= 'A' && r<= 'Z') {
                r+= ' ';
            }else if(!(r >= 'a' && r <= 'z' || r >= '0' && r <= '9')){
                j--;
                continue;
            }
            if(l!=r){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
