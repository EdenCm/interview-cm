package hk.sington;

/**
 * 线程安全的单例模式懒汉模式
 */
public class SingleTonEThread {

    private volatile static SingleTonEThread singleTonEThread;

    public static SingleTonEThread getSingleTonEThread(){
        if (singleTonEThread == null){
            synchronized (SingleTonEThread.class){
                if (singleTonEThread ==null){
                    singleTonEThread = new SingleTonEThread();
                    return singleTonEThread;
                }
            }
        }
        return singleTonEThread;
    }
}
