package lecture18_threads.synchro;

/**
 * Created by yslabko on 018 18.05.16.
 */
public class DeadlockDemo {

    // Два объекта-ресурса
    public final static Object one=new Object(),
            two=new Object();

    public static void main(String s[]) {

        // Создаем два потока, которые будут
        // конкурировать за доступ к объектам
        // one и two
        Thread t1 = new Thread() {
            public void run() {
                // Блокировка первого объекта
                synchronized(one) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {

                    }
//                    Thread.yield();
                    // Блокировка второго объекта
                    synchronized (two) {
                        System.out.println("Success Thread 1!");
                    }
                }
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                // Блокировка второго объекта
                synchronized(two) {
//                    Thread.yield();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Блокировка первого объекта
                    synchronized (one) {
                        System.out.println("Success Thread 2!");
                    }
                }
            }
        };

        // Запускаем потоки
        t1.start();
        t2.start();
        System.out.println("Dead lock!!!!");
    }
}
