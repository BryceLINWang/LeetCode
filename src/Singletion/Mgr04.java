package Singletion;

/**
 * 双重检查模式 （DCL）double check lock
 */

/**
 *在这里使用volatile会或多或少的影响性能，但考虑到程序的正确性，牺牲这点性能还是值得的。 DCL优点是资源利用率高，第一次执行getInstance时单例对象才被实例化，效率高。缺点是第一次加载时反应稍慢一些，
 * 在高并发环境下也有一定的缺陷，虽然发生的概率很小。
 * DCL虽然在一定程度解决了资源的消耗和多余的同步，线程安全等问题，但是他还是在某些情况会出现失效的问题，也就是DCL失效，
 */
public class Mgr04 {
    private static volatile Mgr04 INSTANCE;//JIT
    private Mgr04(){

    }
    public static Mgr04 getInstance(){
        //业务逻辑代码省略
        if(INSTANCE==null){//dcl
            //双重检查
           synchronized (Mgr04.class){
               if (INSTANCE==null){
                   try {
                       Thread.sleep(1);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   INSTANCE=new Mgr04();
               }
           }
        }
        return INSTANCE;
    }
}
