package lecture19_synhro_elements.semaphore;

import java.util.Random;

/**
 * Created by yslabko on 020 20.05.16.
 */
public class PoolDemo implements Runnable {
    private Pool pool;
    private static int ITERATION_COUNT = 50;

    public PoolDemo(Pool pool) {
        this.pool = pool;
    }

    @Override
    public void run() {
        int count = 0;
        while (count ++ < ITERATION_COUNT) {
            int choice = newRandomInt();
            try {
                Atomic data = (Atomic)pool.getItem();
                Thread.sleep(0);
                switch (choice) {
                    case 1 :
                        pool.putItem(data);
                        System.out.printf("%s Итерация = %d  только извлекаем данное = %d%n", Thread.currentThread().getName(), count, data.getData());
                        break;
                    case 2:
                        int putted = newRandomInt(200, 1);
                        data.setData(putted);
                        pool.putItem(data);
                        System.out.printf("%s Итерация = %d  извлекаем и изменяем данное = %d%n", Thread.currentThread().getName(), count, putted);
                        break;
                    default:
                        pool.putItem(newRandomInt(200, 1));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Atomic[] atomics = new Atomic[Pool.MAX_AVAILABLE];
        for (int i = 0; i < atomics.length; i++) {
            atomics[i] = new Atomic();
        }
        Pool pool = Pool.build(atomics);
        for (int i = 0; i++ < 5;) {
            new Thread(new PoolDemo(pool)).start();
        }
    }

    public static int newRandomInt() {
        return newRandomInt(3, 1);
    }

    public static int newRandomInt(int high, int low) {
        Random r = new Random();
        return r.nextInt(high - low) + low;
    }

    public static class Atomic {
        private int data = 0;

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }
}
