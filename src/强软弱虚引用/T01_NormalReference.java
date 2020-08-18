package 强软弱虚引用;

import java.io.IOException;

/**
 * 强引用 普通（常用）引用
 * 在内存不足时也不会被回收
 * 只有当没有任何指向时才会被垃圾回收器回收
 */
public class T01_NormalReference {
    public static void main(String[] args) throws IOException {
        M m=new M();//m指向M
        m=null;//m不在指向M
        System.gc();//DisableExplicitGC
        System.in.read();
    }
}
