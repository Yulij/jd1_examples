package lecture18.simpsons;

/**
 * Class CookieJar
 *
 * Created by yslabko on 07/21/2016.
 */
public class CookieJar {
    private int contents;
    private boolean available = false;

    public synchronized void getCookie(String who) {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        available = false;
        notifyAll();
        System.out.println(who + " кушает  печеньку " + contents);
    }

    public synchronized void putCookie(String who, int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        contents = value;
        available = true;
        System.out.println(who + " положила печеньку " + contents + " в банку");
        notifyAll();
    }
}
