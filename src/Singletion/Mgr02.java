package Singletion;

/**
 * 懒汉模式（线程不安全）
 */

/**
 * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，虽然节约了资源，但第一次加载时需要实例化，
 * 反映稍慢一些，而且在多线程不能正常工作。
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;
    private Mgr02(){

    }
    public static Mgr02 getInstance(){
        if(INSTANCE==null){//多线程判定中肯定修改
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr02();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->
            System.out.println(Mgr02.getInstance().hashCode())//hashcode肯定不一样
            ).start();
        }
    }
}
