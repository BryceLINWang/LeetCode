package 强软弱虚引用;

import java.lang.ref.WeakReference;
//弱引用***
public class T03_WeakReference {
    public static void main(String[] args) {
        WeakReference<M>m=new WeakReference<>(new M());
        //m->WR 强引用
        //WR-----M 弱引用
        System.out.println(m.get());
        System.gc();//一次性 调用垃圾回收器后直接被垃圾回收
        System.out.println(m.get());

        ThreadLocal<M>tl=new ThreadLocal<>();
        tl.set(new M());
        tl.remove();
    }
}
