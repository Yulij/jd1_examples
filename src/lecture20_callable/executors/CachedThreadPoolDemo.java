package lecture20_callable.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by yslabko on 023 23.07.2017.
 */
public class CachedThreadPoolDemo {
    static AtomicInteger counter = new AtomicInteger(1);
    static Integer intCounter = 0;
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        for(int i = 0; i < 99; i++) {
            service.submit(() -> {
                System.out.println(counter.getAndIncrement() + " " + Thread.currentThread().getName());
                System.out.println("Intcounter "+  ++intCounter + " " + Thread.currentThread().getName());
            });
        }
        TimeUnit.SECONDS.sleep(1);
        service.shutdown();
    }
}
