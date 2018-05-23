package lecture04.constructors;

import static java.lang.Math.*;

/**
 * Class ConstructorDemo
 *
 * Created by yslabko on 12/01/2017.
 */
class ConstructorDemo {
    public static void main(String[] args) {
        B b = new B(10);
        C c1 = new C(10);
        C c2 = new C(5);
        c1.a = 666;
        System.out.println(c1.a);
        System.out.println(c2.a);
        c1.c = 555;
        double pi = PI;
        System.out.println(max(c1.c, c2.c));

        System.out.println(c2.c);

    }
}
