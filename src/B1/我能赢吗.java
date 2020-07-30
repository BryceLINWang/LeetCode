package B1;

import java.util.Arrays;
import java.util.HashMap;

public class 我能赢吗 {
    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        //挑一个数稳赢
        if(maxChoosableInteger>=desiredTotal){
            return true;
        }
        //累计和达不到目标
        if(maxChoosableInteger*(maxChoosableInteger+1)/2<desiredTotal){
            return false;
        }
        int []state=new int[maxChoosableInteger+1];
        return booleanWin(state,maxChoosableInteger,desiredTotal,new HashMap<String, Boolean>());
    }
    public boolean booleanWin(int []state, int maxChoosableInteger, int desiredTotal, HashMap<String,Boolean>map){
      String str= Arrays.toString(state);
      if (map.containsKey(str))return map.get(str);
      for(int i=1;i<state.length;i++){
          if (state[i]==0) {
              state[i]=1;
              //如果当前选了i已经赢了或者选了i还没赢但是后面对方选择输了
              if (desiredTotal - i <= 0 || !booleanWin(state, maxChoosableInteger, desiredTotal - i, map)) {
                  map.put(str, true);
                  state[i] = 0;
                  return true;
              }
              state[i] = 0;
          }
      }
      //都没赢
      map.put(str,false);
      return false;
    }
}
