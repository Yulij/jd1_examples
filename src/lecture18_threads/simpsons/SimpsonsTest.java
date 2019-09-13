package lecture18_threads.simpsons;

/**
 * Class SimpsonsTest
 *
 * Created by yslabko on 07/21/2016.
 */
public class SimpsonsTest {

    public static void main(String[] args) throws InterruptedException {

        CookieJar jar = new CookieJar();

        Homer homer = new Homer(jar);
        Marge marge = new Marge(jar);

        new Thread(homer).start();
        Thread.sleep(20);
        new Thread(marge).start();
    }
}