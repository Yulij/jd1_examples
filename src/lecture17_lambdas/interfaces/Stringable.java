package lecture17_lambdas.interfaces;

/**
 * Class Stringable
 *
 * Created by yslabko
 */
@FunctionalInterface
public interface Stringable {
    String prefix = "It is string: ";
    String print(Integer number);
    static boolean isEmpty(String str) {
        return str == null || ("".equals(str));
    }
    default boolean isBlank(String str) {
        return "".equals(str);
    }
}
