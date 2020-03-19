package Leetcode;

public class 最长回文串 {
    /***
     * 对于每个字符 ch，假设它出现了 v 次，我们可以使用该字符 v / 2 * 2 次，在回文串的左侧和右侧分别放置 v / 2 个字符 ch，其中 / 为整数除法。
     * 例如若 "a" 出现了 5 次，那么我们可以使用 "a" 的次数为 4，回文串的左右两侧分别放置 2 个 "a"。
     * 如果有任何一个字符 ch 的出现次数 v 为奇数（即 v % 2 == 1），那么可以将这个字符作为回文中心，注意只能最多有一个字符作为回文中心。
     * 在代码中，我们用 ans 存储回文串的长度，由于在遍历字符时，ans 每次会增加 v / 2 * 2，因此 ans 一直为偶数。
     * 但在发现了第一个出现次数为奇数的字符后，我们将 ans 增加 1，这样 ans 变为奇数，在后面发现其它出现奇数次的字符时，我们就不改变 ans 的值了。
     * @param s
     * @return
     */
    public static int longestPalindrome(String s) {
      int []count=new int[128];//存储字符数量 字母存储ascll码
      for(char c:s.toCharArray()){
          count[c]++;
      }
      int res=0;
      for (int v:count){
        res+=v/2*2;//对于每个字符 ch，假设它出现了 v 次，我们可以使用该字符 v / 2 * 2 次
          if(v%2==1&&res%2==0){
            res++;
          }
      }
      return res;
    }

    public static void main(String[] args) {
      String str="abccccdd";
        System.out.println(longestPalindrome(str));
    }
}
