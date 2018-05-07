package lecture20_callable.future;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by yslabko on 005 05.09.16.
 */
public class ScheduledExecutorsDemo {

    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        ScheduledFuture<?> future = executor.schedule(new Task(), 5, TimeUnit.SECONDS);

        TimeUnit.MILLISECONDS.sleep(1337);

        System.out.printf("CurrentThread " + Thread.currentThread().getName() + " Remaining Delay: ms \n\r");
        executor.shutdown();
    }
}
