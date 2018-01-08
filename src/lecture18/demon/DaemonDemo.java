package lecture18.demon;

/**
 * Created by yslabko on 016 16.05.16.
 */
public class DaemonDemo extends Thread {
    public DaemonDemo() {
        super("Daemon demo thread");
//        setDaemon(true);
        start();
    }

    public void run() {
        Thread threads[]=new Thread[10];
        while (true) {
            // Получаем набор всех потоков из
            // тестовой группы
            int count= ThreadDemo.GROUP.activeCount();
            if (threads.length < count)
                threads = new Thread[count+10];
            count= ThreadDemo.GROUP.enumerate(threads);

            // Распечатываем имя каждого потока
            for (int i=0; i<count; i++) {
                System.out.print(threads[i].getName()+", state = " + threads[i].getState() + " ");
            }
            System.out.println();
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
    }
}