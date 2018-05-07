package lecture18_threads.synchro;

/**
 * Created by yslabko on 018 18.05.16.
 */
public class Data {
    int a=1, b=2;

    public void one() {
        {a=b;}
    }

    public void two() {b=a;}
}
