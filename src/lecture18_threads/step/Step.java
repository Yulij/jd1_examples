package lecture18_threads.step;

/**
 * Class Step
 *
 * Created by yslabko on 01/22/2018.
 */
public class Step {
    private volatile boolean goRight = false;

    public synchronized void left() throws InterruptedException {
        while(goRight) {
            wait();
        }
        move("Left", true);
    }

    public synchronized void right() throws InterruptedException {
        while(!goRight) {
            wait();
        }
        move("Right", false);
    }

    private void move(String leg, boolean goRight) {
        System.out.println(leg);
        this.goRight = goRight;
        notify();
    }
}
