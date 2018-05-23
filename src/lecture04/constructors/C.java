package lecture04.constructors;

/**
 * Class C
 *
 * Created by yslabko on 12/01/2017.
 */
public class C {
    public static int c = 0;
    public int a = 5;

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

    void start() {
        System.out.println("Бомба ядрена запущена на ...");
    }

    private void print() {
    }

    public void printPublicA() {
        System.out.println(a);
    }
}
