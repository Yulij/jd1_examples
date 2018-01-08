package lecture18.simpsons;

/**
 * Class SimpsonsTest
 *
 * Created by yslabko on 07/21/2016.
 */
public class SimpsonsTest {

    public static void main(String[] args) {

        CookieJar jar = new CookieJar();

        Homer homer = new Homer(jar);
        Marge marge = new Marge(jar);

        new Thread(homer).start();
        new Thread(marge).start();
    }
}