package lecture20_callable.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by yslabko on 023 23.07.2017.
 */
public class FixedThreadExecutorDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);
        for(int i = 0; i < 100; i++) {
            service.submit(() -> System.out.println(Thread.currentThread().getName()));
        }
        service.shutdown();
    }
}
