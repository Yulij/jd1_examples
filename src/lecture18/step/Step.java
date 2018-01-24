package lecture18.step;

/**
 * Class Step
 *
 * Created by yslabko on 01/22/2018.
 */
public class Step {
    private boolean available = false;

    public synchronized void left() throws InterruptedException {
        while(available) {
            wait();
        }
        move("Left", true);
    }

    public synchronized void right() throws InterruptedException {
        while(!available) {
            wait();
        }
        move("Right", false);
    }

    private void move(String leg, boolean flag) throws InterruptedException {
        System.out.println(leg);
        available = flag;
        notify();
    }
}
