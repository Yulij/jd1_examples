package lecture18_threads.priority;

/**
 * Created by yslabko on 016 16.05.16.
 */
public class ThreadPriorityDemo implements Runnable {
    public void run() {
        double calc;
        for (int i=0; i<100000; i++) {
            calc = Math.sin(i*i);
            if (i%10000==0) {
                System.out.println(getName()+ " counts " + i/10000 + " calc = " + calc);
            }
        }
    }

    public String getName() {
        return Thread.currentThread().getName() + " priority " + Thread.currentThread().getPriority();
    }

    public static void main(String s[]) throws InterruptedException {
        withoutPriority();
        System.out.println(" ---------------------- ");
        Thread.sleep(1000);
        withPriority();
    }

    public static void withoutPriority() {
        // Подготовка потоков
        System.out.println("Without Thread priority demo");
        Thread t[] = new Thread[3];
        for (int i=0; i<t.length; i++) {
            t[i]=new Thread(new ThreadPriorityDemo(), "Thread "+i);
        }
        // Запуск потоков
        for (int i=0; i<t.length; i++) {
            t[i].start();
            System.out.println(t[i].getName()+ " started");
        }
    }

    public static void withPriority() {
        // Подготовка потоков
        System.out.println("With Thread priority demo");
        Thread t[] = new Thread[3];
        for (int i = 0; i < t.length; i++) {
            t[i] = new Thread(new ThreadPriorityDemo(), "Thread " + i);
            t[i].setPriority(Thread.MIN_PRIORITY +
                    (Thread.MAX_PRIORITY - Thread.MIN_PRIORITY) / t.length * i);
        }
        // Запуск потоков
        for (int i = 0; i < t.length; i++) {
            t[i].start();
            System.out.println(t[i].getName() + " started");
        }
    }
}
