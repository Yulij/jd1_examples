package lecture20_callable.executors;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by yslabko on 023 23.07.2017.
 */
public class SingeThreadExecutorDemo {
    public static void main(String[] args) {
        ThreadFactory tf = new ThreadFactoryBuilder()
                .setNameFormat("Вычислитель # %d").build();
        ExecutorService service = Executors.newSingleThreadExecutor(tf);
        for(int i = 0; i < 10; i++) {
            service.submit(() -> System.out.println(Thread.currentThread().getName()));
        }

        service.shutdown();

        service = Executors.newSingleThreadExecutor();
        for(int i = 0; i < 10; i++) {
            service.submit(new Runnable() {
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
        }
        service.shutdown();
    }
}
