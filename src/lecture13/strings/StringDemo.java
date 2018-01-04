package lecture13.strings;

import java.util.Formatter;

/**
 * Class StringDemo
 *
 * Created by yslabko on 12/20/2017.
 */
public class StringDemo {
    public static void main(String[] args) {
        System.out.println("Wild".indexOf("Wil"));

        Formatter fmt = new Formatter ();
        System.out.println(fmt.format("%6.3f",8.6));
        fmt = new Formatter ();
        System.out.println(fmt.format("%6.3f",108.6));
        fmt = new Formatter ();
        System.out.println(fmt.format("%6.3f",8.6345));
        fmt = new Formatter ();
        System.out.println(fmt.format("%6.3f",188.634));
        fmt = new Formatter ();
        System.out.println(fmt.format("%6.3f",23412348.6));

    }
}
