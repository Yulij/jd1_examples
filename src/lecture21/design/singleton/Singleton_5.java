package lecture21.design.singleton;

/**
 * Class Singleton_5
 *
 * Created by yslabko on 06/28/2017.
 */
public class Singleton_5 {

    public static class SingletonHolder {
        public static final Singleton_5 HOLDER_INSTANCE = new Singleton_5();
    }

    public static Singleton_5 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}