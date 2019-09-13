package lecture20_callable.callable;

import java.util.concurrent.*;

/**
 * Created by Asus on 023 23.07.2017.
 */
public class CallableDemo implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i < 100; i+=3) {
            sum+=i;
        }
        System.out.println("Additional thread: sum= " + sum);
        TimeUnit.SECONDS.sleep(3);
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        FutureTask<Integer> fTask  = new FutureTask<Integer>(new CallableDemo());
        Thread t = new Thread(fTask);
        t.start();

//        Thread.sleep(1500);
//        System.out.println(fTask.get());
        System.out.println("isDone() " + fTask.isDone());
        System.out.println("Сумма равна " + fTask.get(1, TimeUnit.SECONDS));
//        fTask.get(2l, TimeUnit.SECONDS);
    }
}
