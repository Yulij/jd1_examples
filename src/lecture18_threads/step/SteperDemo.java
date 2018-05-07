package lecture18_threads.step;

/**
 * Class SteperDemo
 *
 * Created by yslabko on 01/22/2018.
 */
public class SteperDemo {
    public static void main(String[] args) {
        Step step = new Step();
        new Steper(Leg.LEFT, step);
        new Steper(Leg.RIGHT, step);
    }
}
