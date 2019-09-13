package lecture03_loops;

/**
 * Class ForDemo
 *
 * Created by yslabko on 05/07/2018.
 */
public class ForDemo {
    public static void main(String[] args) {
        breakDemo();
        continueDemo();
    }

    private static void breakDemo() {
        int i = 17;
        while (i <= 28) {
            if (i % 13 == 0) {
                break;
            }
            i++;
        }
        System.out.println("First number is : " + i);
    }

    private static void continueDemo() {
        for (int i = 1; i < 5; i++) {
            if (i == 3) {
                System.out.println("continue!");
                continue;
            }
            System.out.println("i = " + i);
        }

        for (; ; ) {
            break;
        }
    }
}
