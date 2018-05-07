package lecture03_loops;

/**
 * Class WhileDemo
 *
 * Created by yslabko on 05/07/2018.
 */
public class WhileDemo {

    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.print("sum = " + sum);
    }
}
