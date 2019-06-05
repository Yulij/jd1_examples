package lecture20_callable.volatiles;

import java.lang.reflect.Field;
import java.util.Arrays;

import lombok.Data;

/**
 * Created by yslabko 23.07.2017.
 */
public class VolatileDemo {
    private volatile static boolean running = true;

    public static void main(String[] args) throws InterruptedException, IllegalAccessException {
        demo();
    }

    private static void demo() throws InterruptedException {
        Thread runner = new Thread(() -> {
            while(running) {
                System.out.println("Hello");
            }
        });
        Thread stopper = new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            running = false;
        });
        runner.start();
        stopper.start();
        runner.join();
        stopper.join();
    }
}