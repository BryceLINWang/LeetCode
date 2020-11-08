package phoenix.牛客;

public class 替换空格 {
    public static String replaceSpace(StringBuffer str) {
        if (str==null||str.length()==0)return "";
        String tmp=str.toString();
        StringBuilder sb=new StringBuilder();
        String[]strs=tmp.split(" ");
        for(int i=0;i<tmp.length();i++){
            if(tmp.charAt(i)==' '){
                sb.append("%20");
            }else {
                sb.append(tmp.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("HelloWorld ");
        System.out.println(replaceSpace(str));
    }
}
