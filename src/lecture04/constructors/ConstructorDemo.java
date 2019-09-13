package lecture04.constructors;

import lecture04.constructors.test.A;

import static java.lang.Integer.max;
import static java.lang.Math.PI;
import static java.lang.Math.sin;

/**
 * Class ConstructorDemo
 *
 * Created by yslabko on 12/01/2017.
 */
class ConstructorDemo {
    int a = 100;

    public static void main(String[] args) throws CloneNotSupportedException {
        double pi = PI*sin(.5);
        ConstructorDemo demo = new ConstructorDemo();
        ConstructorDemo demo1 = new ConstructorDemo();
        demo.print();
        B bObject = new B(80);
        B b = new B(10);
        C c1 = new C(10);
        C c2 = new C(5);
        c1.a = 666;
        lecture04.constructors.test.A testA = new lecture04.constructors.test.A(50);
        testA.setContent("Test");
        System.out.println(c1.a);
        System.out.println(c2.a);
        c1.c = 555;
        System.out.println(max(c1.c, c2.c));

        System.out.println(c2.c);
        System.out.println(testA.getA());
        System.out.println(testA);

        process(testA);
//        process((lecture04.constructors.test.A)testA.clone());

        lecture04.constructors.test.A arg2 = new lecture04.constructors.test.A(55);
        System.out.println(testA.getA());
        System.out.println((lecture04.constructors.test.A)testA.clone());


    }

    private static void process(A argument) {
        argument.setA(555);
        argument.setContent("123");
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    void print() {

    }

    @Override
    public String toString() {
        return "ConstructorDemo{" +
                "a=" + a +
                '}';
    }
}
