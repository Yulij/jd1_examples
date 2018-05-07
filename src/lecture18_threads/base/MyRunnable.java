package lecture18_threads.base;

/**
 * Created by yslabko on 016 16.05.16.
 */
public class MyRunnable implements Runnable {
    public void run() {
        // некоторое долгое действие, вычисление
        long sum=0;
        for (int i=0; i<1000; i++) {
            sum+=i;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Runnable r = new MyRunnable();
        Thread t = new Thread(r);
        t.start();
    }
}
