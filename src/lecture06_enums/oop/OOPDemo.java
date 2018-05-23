package lecture06_enums.oop;

/**
 * Created by yslabko on 05/16/2018.
 */
public class OOPDemo {
    public static void main(String[] args) {
        A a = new A();
        a.getCount();
        B b = new B();
        A ab = new B();
        ab.print();
    }
}
