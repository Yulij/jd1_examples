package lecture18_threads.simpsons;

/**
 * Class Homer
 *
 * Created by yslabko on 07/21/2016.
 */
public class Homer implements Runnable {
    // Банка с печеньками
    CookieJar jar;

    public Homer(CookieJar jar) {
        this.jar = jar;
    }
    // Описываем, как Гомер кушает
    public void eat() {
        jar.getCookie("Homer");
        try {
             Thread.sleep((int)Math.random() * 1000);
        } catch (InterruptedException ie) {}
    }

    //Гомер насыщается 10 печеньками
    public void run() {
        for (int i = 1 ; i <= 10 ; i++) eat();
    }
}
