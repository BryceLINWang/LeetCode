package B1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 这个问题是 LeetCode 平台新增的交互式问题 。
 *
 * 我们给出了一个由一些独特的单词组成的单词列表，每个单词都是 6 个字母长，并且这个列表中的一个单词将被选作秘密。
 *
 * 你可以调用 master.guess(word) 来猜单词。你所猜的单词应当是存在于原列表并且由 6 个小写字母组成的类型字符串。
 *
 * 此函数将会返回一个整型数字，表示你的猜测与秘密单词的准确匹配（值和位置同时匹配）的数目。此外，如果你的猜测不在给定的单词列表中，它将返回 -1。
 *
 * 对于每个测试用例，你有 10 次机会来猜出这个单词。当所有调用都结束时，如果您对 master.guess 的调用不超过 10 次，并且至少有一次猜到秘密，那么您将通过该测试用例。
 *
 * 除了下面示例给出的测试用例外，还会有 5 个额外的测试用例，每个单词列表中将会有 100 个单词。这些测试用例中的每个单词的字母都是从 'a' 到 'z' 中随机选取的，并且保证给定单词列表中的每个单词都是唯一的。
 */
class Master {
    public int guess(String word) {return 0;}
 }
public class 猜猜这个单词 {
    private int judge(String a,String b){
        int cnt=0;
        for(int i=0;i<6;i++){
            if(a.charAt(i)==b.charAt(i)){
                cnt++;
            }
        }
        return cnt;
    }
    private void find(List<String> w,Master master){
        int len=w.size();
        if (len==0)return;
        Random random=new Random();
        int x=random.nextInt(len);
        int c=master.guess(w.get(x));
        List<String> tmp=new ArrayList<>();
        for(int i=0;i<len;i++){
            while(i!=x&&judge(w.get(x),w.get(i))==c){
                tmp.add(w.get(i));
            }
        }
        find(tmp,master);
    }
    public void findSecretWord(String[] wordlist, Master master) {
        List<String> res= Arrays.asList(wordlist);
        find(res,master);
    }
}
