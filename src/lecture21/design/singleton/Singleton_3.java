package lecture21.design.singleton;

public class Singleton_3 {
    private static Singleton_3 instance=null;

    private Singleton_3() {
    }

    public static synchronized Singleton_3 getInstance() {
        if (instance == null) {
            instance = new Singleton_3();
        }
        return instance;
    }
}