package Singletion;

/**
 * 懒汉模式（线程安全）
 */
/**
 *这种写法能够在多线程中很好的工作，但是每次调用getInstance方法时都需要进行同步，造成不必要的同步开销，
 * 而且大部分时候我们是用不到同步的，所以不建议用这种模式。
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;
    private Mgr03(){

    }
    public static synchronized Mgr03 getInstance(){
        if(INSTANCE==null){//多线程判定中肯定修改
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE=new Mgr03();
        }
        return INSTANCE;
    }
    public void m(){
        System.out.println("m");
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            new Thread(()->
                    System.out.println(Mgr03.getInstance().hashCode())//hashcode肯定不一样
            ).start();
        }
    }
}
