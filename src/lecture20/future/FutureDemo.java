package lecture20.future;

/**
 * Created by yslabko on 030 30 2015.
 */

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {
    public static void main(String[] args) throws Exception {
        System.out.println("Main started.");
        new Data().solve();
        System.out.println("Main finished.");
    }
}

class Data {
    public void solve() throws Exception {
        List<Future<String>> futures = new ArrayList<Future<String>>();

        ExecutorService es = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 7; i++)
            futures.add(es.submit(new MyCallable<String>()));
        es.shutdown();
        //es.shutdownNow();
        for (Future<String> f : futures)
            System.out.println(f.get());
    }
}

class MyCallable<T> implements Callable {

    @Override
    public T call() throws Exception {
        String res = Thread.currentThread().getName();
        Thread.sleep(1000);
        System.out.println("done");
        return (T) res;
    }
}
