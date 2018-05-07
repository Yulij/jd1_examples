package lecture07_inner.inner;

public class Outer {
    private String myString = "outer";
    private String outerString = "outer outer !";

    void test() {
        System.out.print("test ");
        System.out.println(myString);
        new Inner().testInner();
    }

    private void test2() {
        System.out.print("test2 ");
        System.out.println(myString);
    }

    class Inner {
        private String myString = "inner";

        private void testInner() {
            System.out.print("testInner ");
            System.out.println(myString);
            System.out.println(outerString);
            test2();
        }
    }
}  