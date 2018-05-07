package lecture19_synhro_elements.cyclicbarrier;

/**
 * Created by yslabko on 030 30 2015.
 */

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Java program to demonstrate how to use CyclicBarrier in Java. CyclicBarrier is a
 * new Concurrency Utility added in Java 5 Concurrent package.
 */

public class CyclicBarrierDemo {
    private static class Task implements Runnable {
        private CyclicBarrier barrier;
        public Task(CyclicBarrier barrier, String name) {
            this.barrier = barrier;
            new Thread(this, name).start();
        }
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " ожидает у барьера");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + " пересек барьер");
            } catch (InterruptedException ex) {
                Logger.getLogger(CyclicBarrierDemo.class.getName()).log(Level.SEVERE, null, ex);
            } catch (BrokenBarrierException ex) {
                Logger.getLogger(CyclicBarrierDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void main(String args[]) {
        final CyclicBarrier cb = new CyclicBarrier(3, new Runnable() {
            @Override
            public void run() {
                System.out.println("Все потоки уже собраны у барьера.");
                try {
                    System.out.println("3!");
                    Thread.sleep(1000);
                    System.out.println("2!");
                    Thread.sleep(1000);
                    System.out.println("1!");
                    Thread.sleep(1000);
                    System.out.println("Поехали!");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        new Task(cb, "Поток 1");
        new Task(cb, "Поток 2");
        new Task(cb, "Поток 3");
        System.out.println(" Ожидающие" + cb.getNumberWaiting());

    }
}

