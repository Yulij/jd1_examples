package lecture18_threads.base;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Class ThreadLocalDemo
 * <p>
 * Created by yslabko on 07/17/2017.
 */
public class ThreadLocalDemo {
    static ThreadLocal<Long> shared = new ThreadLocal<>();
    static Long sharedObject = 0L;
    static Thread th;

    static long end = 0;

    public static void main(String[] args) throws InterruptedException {
        shared.set(555L);
        sharedObject = 555L;
        th = new Thread() {
            public void run() {
                end = System.nanoTime();
                System.out.println("Дополнительный поток выполнения");
                // некоторое долгое действие, вычисление
                long sum = 0;
                System.out.println("Shared Thread Local (T2): " + shared.get());
                System.out.println("Shared Long (T2): " + sharedObject);
                int i = 0;
                for (; i < 1000; i++) {
                    sum += i;
                    shared.set(sum);
                    sharedObject = sum;
                }
                System.out.println("i = " + i + " Sum: " + sum);
                System.out.println("Shared Thread Local (T2): " + shared.get());
                System.out.println("Shared Long (T2): " + sharedObject);
                System.out.println();
            }
        };

        long start = System.nanoTime();
        th.start();
        System.out.println("Shared Thread Local (T1): " + shared.get());
        System.out.println("Shared Long (T1): " + sharedObject);
        shared.set(-1L);
        System.out.println("Shared Thread Local (T1): " + shared.get());
        System.out.println("Shared Long (T1): " + sharedObject);
        Thread.sleep(200);
        System.out.println("Shared Thread Local (T1): " + shared.get());
        System.out.println("Shared Long (T1): " + sharedObject);
        System.out.println("Основной поток выполнения");
        System.out.println(" Thread creation time = " + (end - start) + " nano seconds");
    }
}