package lecture18.synchro;

/**
 * Class NotifyDemo
 *
 * Created by yslabko on 07/21/2017.
 */
public class NotifyDemo implements Runnable {
    final static private Object shared = new Object();
    private int type;

    public NotifyDemo(int i) {
        type = i;
    }

    public void run() {
        if (type == 1 || type == 2) {
            synchronized (shared) {
                try {
                    shared.wait();
                } catch (InterruptedException e) {
                }
                System.out.println("Thread " + type + " after wait()");
            }
        } else {
            synchronized (shared) {
                shared.notifyAll();
                System.out.println("Thread " + type + " after notifyAll()");
            }
        }
    }

    public static void main(String s[]) {
        NotifyDemo w1 = new NotifyDemo(1);
        new Thread(w1).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        NotifyDemo w2 = new NotifyDemo(2);
        new Thread(w2).start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
        NotifyDemo w3 = new NotifyDemo(3);
        new Thread(w3).start();
    }
}