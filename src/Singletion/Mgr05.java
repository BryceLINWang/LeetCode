package Singletion;

/**
 * 静态内部类
 * 第一次加载Singleton类时并不会初始化sInstance，
 * 只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 */
public class Mgr05 {
     private Mgr05(){

     }
     public static Mgr05 getInstance(){
         return SingletonHolder.sInstance;
     }
     private static class  SingletonHolder{
         private static final Mgr05 sInstance =new Mgr05();
     }
}
