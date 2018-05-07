package lecture07_inner.inner.scope;

/**
 * Class ScopeConflictDemo
 *
 * Created by yslabko on 12/08/2017.
 */
public class ScopeConflictDemo {
    public static void main(String[] args) {
        ScopeConflict sc = new ScopeConflict();
        ScopeConflict.Inner inner = sc.new Inner();
    }
}
