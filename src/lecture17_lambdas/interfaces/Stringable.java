package lecture17_lambdas.interfaces;

/**
 * Class Stringable
 *
 * Created by yslabko
 */
public interface Stringable {
    String prefix = "It is string: ";
    String print(Integer number);
    static boolean isEmpty(String str) {
        return str == null || ("".equals(str));
    }
}
