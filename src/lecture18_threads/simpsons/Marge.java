package lecture18_threads.simpsons;

/**
 * Class Marge
 *
 * Created by yslabko on 07/21/2016.
 */
public class Marge implements Runnable {
    CookieJar jar;

    public Marge(CookieJar jar) {
        this.jar = jar;
    }

    public void bake(int cookieNumber) {
        jar.putCookie("Marge", cookieNumber);
        try {
            Thread.sleep((int)Math.random() * 1000);
        } catch (InterruptedException ie) {}
    }

    //Марж готовит 10 печенек
    public void run() {
        for (int i = 1 ; i <= 10 ; i++) bake(i);
    }
}