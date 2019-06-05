package lecture18_threads.base;

/**
 * Created by yslabko on 016 16.05.16.
 */
public class MyThread extends Thread {
    public void run() {
        System.out.println("Additional thread");
        // некоторое долгое действие, вычисление
        long sum=0;
        System.out.println("Thread " + this.getName() + " State:" + this.getState());
        for (int i=0; i<1000; i++) {
            sum+=i;
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t = new MyThread();
        Thread thread = new Thread(() -> {
            System.out.println("New Thread:" + Thread.currentThread().getName());
        });
//        thread.start();
        t.start();
        t.interrupt();
//        t.join();
        System.out.println("Main thread.");
    }
}
