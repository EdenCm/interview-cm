package hk.sington;

/**
 * 非线程安全懒汉模式
 */
public class SingleTonL {
    
    private static SingleTonL singleTon;

    public SingleTonL() {
    }

    public static SingleTonL getInstance(){
        if (singleTon == null){
            singleTon = new SingleTonL();
            return singleTon;
        }
        return singleTon;
    }
}
