package lecture17_lambdas.interfaces;

/**
 * Class StringableDemo
 *
 * Created by yslabko
 */
public class StringableDemo {

    public static void main(String[] args) {
        Stringable s = (Integer number) -> Stringable.prefix + number.toString();
        System.out.println(s.print(128));
        System.out.println(Stringable.isEmpty(""));
    }
}
