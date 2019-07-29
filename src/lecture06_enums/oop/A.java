package lecture06_enums.oop;

/**
 * Created by yslabko on 05/16/2018.
 */
public class A {
    private int count = 100;

    A() {
        System.out.println("A");
    }

    public A(String with_parameter) {
        System.out.println(" A with " + with_parameter);
    }


    protected double getSum(double a, double b) {
        return a+b;
    }

    public int getCount() {
        modifyCount();
        return count;
    }
    private void modifyCount() {
        count++;
    }

    void print() {
        System.out.println("print in A");
    }

}
