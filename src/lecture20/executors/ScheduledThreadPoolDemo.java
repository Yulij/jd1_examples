package lecture20.executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Created by yslabko on 07/23/2017.
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
            service.scheduleWithFixedDelay(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            }, 2, 5, TimeUnit.SECONDS);
        TimeUnit.SECONDS.sleep(4);
        service.shutdown();
    }
}
