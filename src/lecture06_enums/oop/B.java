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
