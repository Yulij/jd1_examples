package lecture18_threads.synchro;

/**
 * Created by yslabko on 016 16.05.16.
 */
public class ThreadTest {
    private int a=1;
    private int b=2;
    public void one() {a=b;}

    public void two() {b=a;}

    public static void main(String s[]) {
        int aOverritten=0, bOverritten=0, abOverritten=0;
        for (int i=0; i<100; i++) {
            final ThreadTest o = new ThreadTest();
            // Запускаем первый поток, который
            // вызывает метод one()
            new Thread(o::one).start();

            // Запускаем второй поток, который
            // вызывает метод two()
            new Thread(o::two).start();

            // даем потокам время отработать
            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {}

            // анализируем финальные значения
            if (o.a==1 && o.b==1) aOverritten++;
            if (o.a==2 && o.b==2) bOverritten++;
            if (o.a!=o.b) abOverritten++;
        }
        System.out.println("aOverritten:" + aOverritten+" bOverritten:"+bOverritten+" abOverritten:"+abOverritten);
    }
}
