package lecture07.inner.scope;

/**
 * Created by Yuli on 31.05.2015.
 */
public class ScopeConflict {
    String s = "outer";
    class Inner extends SuperClass {
        String s = "inner";
        void foo(){
            System.out.println(s);
        }
    }
}

class SuperClass {
    String s = "super";
}

