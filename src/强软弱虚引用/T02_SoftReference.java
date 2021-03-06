package 强软弱虚引用;

import java.lang.ref.SoftReference;

/**
 * 软引用在内存不足时会被回收
 */
public class T02_SoftReference {
    public static void main(String[] args) {
        SoftReference<byte[]>m=new SoftReference<>(new byte[1024*1024*10]);//用了10M 堆总共20M
        //m->SR 强引用
        //SR~~byte[] 软引用
        //m=null;
        System.out.println(m.get());
        System.gc();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(m.get());
        //再分配一个数组，heap将装不下，这时候系统会垃圾回收，先回收一次，如果不够，会把软引用干掉
        byte[] b=new byte[1024*1024*15];//15M
        System.out.println(m.get());
    }
}
//软引用非常适合缓存使用
//创建缓存时，创建的对象放进缓存中，当内存不足时，JVN就会回收早先创建的对象