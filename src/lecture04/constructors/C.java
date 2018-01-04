package lecture04.constructors;

/**
 * Class C
 *
 * Created by yslabko on 12/01/2017.
 */
public class C {
    public static int c = 0;

    private void start() {
        System.out.println("Бомба ядрена запущена на ...");
    }

    public int publicA = 5;

    C() {
        System.out.println("Constructor C");
    }

    public C(int a) {
        System.out.println("Constructor C");
    }

    private void print() {
    }

    public void printPublicA() {
        System.out.println(publicA);
    }
}
