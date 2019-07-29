package lecture06_enums.oop;

/**
 * Created by yslabko on 05/16/2018.
 */
public class B extends A {
    public int age;

    B() {
        super("1234");
        System.out.println("B");
    }
    B (int count, long l) {

    }

    @Override
    protected double getSum(double a, double b) {
        System.out.print("Arg1:" + a + "Arg2:" + b + " Sum= ");
        return super.getSum(a, b);
    }

    public int getAge() {
        return age;
    }

    void print() {
        System.out.println("print in B");
    }

    public void setAge(int age) {
        this.age = age;
    }
}
