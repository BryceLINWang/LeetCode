package revi;

import java.util.HashMap;
import java.util.Map;

public class 括号的匹配 {
    public boolean isValid(String s){
        Map<Character,Character>map=new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        return false;
    }
}
