package hk.sington;

/**
 * 饿汉模式
 */
public class SingleTonE {

    private static SingleTonE singleTonInstance = new SingleTonE();
    private SingleTonE(){}
    public static SingleTonE getInstance(){
        return singleTonInstance;
    }
}
