package lecture18.base;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Class AnonymDemo
 * <p>
 * Created by yslabko on 07/17/2017.
 */
public class AnonymDemo {
    static ThreadLocal<Long> shared = new ThreadLocal<>();
    static Object sharedObject = new Object();
    static StringBuilder sb = new StringBuilder();
    static Thread th;

    static long end = 0;

    public static void main(String[] args) throws InterruptedException {
        shared.set(555L);
        th = new Thread() {
            public void run() {
                end = System.nanoTime();
                System.out.println("Дополнительный поток выполнения");
                // некоторое долгое действие, вычисление
                long sum = 0;
                System.out.println("Shared new Thread: " + shared.get());
                int i = 0;
                for (; i < 1000; i++) {
                    sum += i;
                    shared.set(sum);
                }
                System.out.println("i = " + i + " Sum: " + sum);
                System.out.println("Shared new thread: " + shared.get());
                System.out.println();
            }
        };

        Runnable r = () -> {
            int i = 0;
            ReentrantLock lock = new ReentrantLock();
            for (; i < 1000; i++) {
                try {
                    lock.lock();
                    sb.append(Thread.currentThread() + "->" + i + " ");
                } finally {
                    lock.unlock();
                }

            }
        };

        new Thread(r).start();
        new Thread(r).start();

        long start = System.nanoTime();
        th.start();
        System.out.println("Shared main thread: " + shared.get());
        shared.set(-1L);
        System.out.println("Shared main thread: " + shared.get());
        Thread.sleep(200);
        System.out.println("Основной поток выполнения");
        System.out.println(" Diff = " + (end - start));
        System.out.println(sb.toString());
    }
}