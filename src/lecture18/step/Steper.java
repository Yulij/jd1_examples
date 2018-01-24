package lecture18.step;

/**
 * Class Steper
 *
 * Created by yslabko on 01/22/2018.
 */
public class Steper extends Thread {
    private Leg leg;
    private Step step;
    private volatile int count = 50;

    public Steper(Leg leg, Step step) {
        this.leg = leg;
        this.step = step;
        this.start();
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            try {
                switch (leg) {
                    case LEFT:
                        step.left();
                        break;
                    case RIGHT:
                        step.right();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
