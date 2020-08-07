package Singletion;
/*
单例模式保证一个类仅有一个实例，并提供一个访问它的全局访问点。
 */

/**
 * 饿汉模式
 * 这种方式在类加载时就完成了实例化，所以类加载较慢，
 * 但获取对象的速度快。 这种方式基于类加载机制避免了多线程的同步问题，
 * 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始化instance显然没有达到懒加载的效果。
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE=new Mgr01();

    private Mgr01(){};

    public static Mgr01 getInstance(){return INSTANCE;}

    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        Mgr01 m1=Mgr01.getInstance();
        Mgr01 m2=Mgr01.getInstance();
        System.out.println(m1==m2);
    }
}
