package lecture21_design_patterns.design.singleton;

/**
 * Class Singleton_4
 *
 * Created by yslabko on 06/28/2017.
 */
public class Singleton_4 {
    private static volatile Singleton_4 instance;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        Singleton_4 localInstance = instance;

        if (localInstance == null) {
            synchronized (Singleton_4.class) {
                localInstance = instance;
                if (localInstance == null) {
                    localInstance = instance = new Singleton_4();
                }
            }
        }

        return localInstance;
    }
}