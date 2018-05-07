package lecture19_synhro_elements.queue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author yslabko
 */
public class Queue {

    private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);
    private static Random random = new Random();

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(Queue::produce);
        Thread consumer = new Thread(Queue::consume);
        producer.start();
        consumer.start();
        producer.join();
        consumer.join();
    }

    public static void produce() {
        while (true) {
            try {
                int data = getInt(1, 100);
                System.out.println("Adding " + data);
                queue.put(data);
                Thread.sleep(getInt(10, 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void consume() {
        while(true) {
            try {
                System.out.println("Removing: " + queue.take());
                Thread.sleep(getInt(10, 500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static int getInt(int start, int end) {
        return ThreadLocalRandom.current().nextInt(start, end + 1);
    }
}