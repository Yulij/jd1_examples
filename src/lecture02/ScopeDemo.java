package lecture02;

/**
 * Created by yslabko on 11/29/2017.
 */
public class ScopeDemo {
    int i = 10;
    int counter = 10;

    public ScopeDemo(int i, int counter, int counterForPage) {
        if (i == 100 && counter == 555) {
            return;
        }
        this.i = i;
        this.counter = counter;
        this.counterForPage = counterForPage;
    }

    int counterForPage = 11;

    private ScopeDemo() {
        System.out.println("Конструктор!");
    }

    public ScopeDemo(int i) {
        this(i, 555);
        this.i = i++;
    }

    public ScopeDemo(int i, int counter) {
        this.i = i;
        if (counter == 555)
            System.out.println(555);
        this.counter = counter;
    }

    public static void main(String[] args) {
        ScopeDemo scopeDemo = new ScopeDemo(10);
    }

    public void print() {
        int count = 100;
        {
            int counter = 100;

            System.out.println(counter);
        }
        System.out.println(i);
        System.out.println(counter);
    }

    public void printCount() {
    }
}
