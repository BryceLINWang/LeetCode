package 强软弱虚引用;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 虚引用
 * get不到
 * 作用：管理堆外内存
 * 当指向堆外内存的对象被回收时，通过Queue可以检测到，然后清理堆外内存
 */
public class T04_PhantomReference {
   private static final List<Object>LIST=new LinkedList<>();
   private static final ReferenceQueue<M>QUEUE=new ReferenceQueue<>();

    public static void main(String[] args) {
        PhantomReference<M>phantomReference=new PhantomReference<>(new M(), QUEUE);
        new Thread(()->{
            while (true){
                LIST.add(new byte[1024*1024]);
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt();
                }
                System.out.println(phantomReference.get());
            }
        }).start();
        new Thread(()->{
            while (true){
                Reference<? extends M>poll=QUEUE.poll();
                if (poll==null){
                    System.out.println("---虚引用对象被jvm回收了---"+poll);
                }
            }
        }).start();
    }
}
