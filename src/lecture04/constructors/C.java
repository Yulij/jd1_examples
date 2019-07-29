package lecture04.constructors;

import java.util.Objects;

/**
 * Class C
 *
 * Created by yslabko on 12/01/2017.
 */
public class C {
    public static int c = 0;
    public int a = 5;
    private int b = 555;
    final A aObj = new B();

    C() {
        System.out.println("Constructor C");
    }

    public C(int a) {
        this.a = a;
        System.out.println("Constructor C");
    }

    C (String str) {
        System.out.println(str);
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        setBLogic(b);
    }

    private void setBLogic(int b) {
        if ( b > 500 && b < 600)
        this.b = b;
    }

    void start() {
        System.out.println("Бомба ядрена запущена на ...");
    }

    private void print(int i) {
    }
    private void print(String text) {
        System.out.println("Text:" + text);
    }

    protected void printPublicA() {
        System.out.println(a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        C c = (C) o;
        return a == c.a &&
                b == c.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }
}
