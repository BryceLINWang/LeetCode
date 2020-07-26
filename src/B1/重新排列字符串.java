package B1;

public class 重新排列字符串 {
    public String restoreString(String s, int[] indices) {
        char []chars=new char[indices.length];
        for(int i=0;i<indices.length;i++){
            chars[indices[i]]=s.charAt(i);
        }
        return String.valueOf(chars);
    }
}
